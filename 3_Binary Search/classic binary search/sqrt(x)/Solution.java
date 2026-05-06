// https://leetcode.com/problems/sqrtx/description/

class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1) return x;
        int low=0,high=x;
        while(low<=high){
            int mid=low+(high-low)/2;

            if((long) mid*mid > (long) x) //mid k sq > no => no k sq root lower half m hoga 
                high=mid-1;
            else if((long) mid*mid < (long) x) //mid k sq < no => no k sq root upper half m hoga 
                low=mid+1;
            else 
                return mid;
        }
        return Math.round(high);
    }
}