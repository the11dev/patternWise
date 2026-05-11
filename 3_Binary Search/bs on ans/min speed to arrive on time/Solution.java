// https://leetcode.com/problems/minimum-speed-to-arrive-on-time/

// brute force
class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int n=dist.length;

        int low=1;
        int high=(int) 1e7;        // as ans will not exceed 10**7 

    // brute force as time complexity in O(s*n)
                                    // i.e s=10**7, n=10**5 = O(10**12)  
        for(int speed=low;speed<=high;speed++){
            double time=0.0;
            for(int j=0;j<n;j++){
                double t= (double) dist[j]/speed;
                if(j!=n-1) // not last elem : integer/ ceil val  
                    time+=Math.ceil(t);
                else 
                    time+=t;
            }
            if(time<=hour) //as we are starting from low (ie min val) 
                return speed;
        }
        return -1;
    }
}

// optimised
    // used Binary Search : O(nlogn)
    // time complexity: O(nlogs) where s=range of speed  , n= dist.length
class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {

        int low=1;
        int high=(int) 1e7;        // as ans will not exceed 10**7
        int ans=-1; 
        while(low<=high){
            int mid=low+(high-low)/2;

            if(timeTaken(mid,dist,hour)){
                ans=mid;    // possible ans
                high=mid-1; // need to check left half for min speed
            }else{
                low=mid+1;  //time > req => speed inc  (ie. search right half )
            }
        }
        return ans;
    }
    boolean timeTaken(int mid,int[] dist,double hour){
        double time=0.0;
        int n=dist.length;
        for(int j=0;j<n;j++){
            double t= (double) dist[j]/mid;
            if(j!=n-1) // not last elem : integer/ ceil val  
                time+=Math.ceil(t);
            else 
                time+=t;
        }
        if(time<=hour) //as we are starting from low (ie min val) 
            return true;
        else 
            return false;
    }     
}