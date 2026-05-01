// https://leetcode.com/problems/subarray-product-less-than-k/

// Input: nums = [10,5,2,6], k = 100
// Output: 8

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if(k<=1) return 0;
        int i=0,j=0, c=0,p=1;
        while(j<nums.length){
            p*=nums[j];
            j++;
            while(p>=k){
                p/=nums[i];
                i++;
            }
            c+=j-i;
        }
        return c;
    }
}