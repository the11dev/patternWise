// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

// Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

// Input: nums = [4,5,6,7,0,1,2], target = 0
// Output: 4

// Input: nums = [4,5,6,7,0,1,2], target = 3
// Output: -1

class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid= low+(high-low)/2;

            if(nums[mid]==target) return mid;
            else if(nums[mid]>=nums[low]){ //lower half is sorted
                if(target< nums[mid] && target>=nums[low])
                    high=mid-1;
                else 
                    low=mid+1;
            }
            else if(nums[mid]<=nums[high]){ // upper half is sorted
                if(target>nums[mid] && target<=nums[high])
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        return -1;
    }
}
