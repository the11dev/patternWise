// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

// Given the sorted rotated array nums of unique elements, return the minimum element of this array.

class Solution {
    public int findMin(int[] nums) {
        int low=0,high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;

            if(nums[mid]>nums[high]){
                // left side is sorted i.e mid+1 = ans
                low=mid+1;
            }
            else { // right side is sorted ie lower half m check krenge ab
                high=mid;
            }
        }
        return nums[low];
    }
}