// https://leetcode.com/problems/koko-eating-bananas/

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=findMax(piles);

        while(low<high){
            int mid=low+(high-low)/2;

            if(canFinish(piles, h, mid)){
                // might be the ans
                high=mid;

            }else{
                // speed too sloww
                low=mid+1;
            }
        }
        return low;
    }
    
    public boolean canFinish(int[]piles , int h,int k){
        long sum=0;
        for(int p:piles){
            sum+=(p+k-1)/k; //cell division
            // if(p%k!=0) sum++;
        }
        return sum<=h;
    }

    int findMax(int[] piles){
        int max=Integer.MIN_VALUE;
        for(int p:piles){
            max=Math.max(p,max);
        }
        return max;
    }
}