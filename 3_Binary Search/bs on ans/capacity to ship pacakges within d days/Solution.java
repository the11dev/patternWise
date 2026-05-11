// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=getMax(weights);
        int high=getSum(weights);
        
        while(low<high){
            int mid=low+(high-low)/2;
            
            if(getDays(weights,mid)>days) low=mid+1;
            else high=mid;
        }
        return low;
    }

    int getMax(int[] arr){
        int max=arr[0];
        for(int i:arr) max=Math.max(max,i);
        return max;
    }

    int getSum(int[] arr){
        int sum=0;
        for(int i:arr) sum+=i;
        return sum;
    }

    int getDays(int[] arr, int mid){
        int day=1;
        int curr=0;
        for(int i:arr){
            if(i+curr>mid){
                day++;
                curr=0;
            }
            curr+=i;
        }
        return day;
    }
}