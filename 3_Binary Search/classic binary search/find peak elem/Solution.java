// https://leetcode.com/problems/find-peak-element/

// Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

class Solution {
    public int findPeakElement(int[] nums) {
        int low=0,high=nums.length-1;

    // loop can be written either ways:
        // 1. nums[mid] > nums[mid + 1], compare with its right side
        // 2. nums[mid] > nums[mid - 1], compare with its left side


        // i  m     j           mid is smaller than right side 
        // 1  2  3  1           nums[mid] < nums[mid + 1] so i moves

        //       im j           mid is greater than right side
        // 1  2  3  1           nums[mid] > nums[mid + 1] so j moves

        //       ij             loop breaks
        // 1  2  3  1     

        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]<nums[mid+1]) low=mid+1;
            else high=mid;
        }
        return low;
    }
}