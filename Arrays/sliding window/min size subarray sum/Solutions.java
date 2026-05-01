// https://leetcode.com/problems/minimum-size-subarray-sum/

// Input: target = 7, nums = [2,3,1,2,4,3]
// Output: 2

// Input: target = 4, nums = [1,4,4]
// Output: 1

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0,sum=0,min=Integer.MAX_VALUE;

        while(j<nums.length){
            sum+=nums[j];
            j++;
            while(sum>=target){
               min=Math.min(min,j-i);
               sum-=nums[i];
               i++; 
            }
        }
        return min==Integer.MAX_VALUE ? 0:min;
    }
}