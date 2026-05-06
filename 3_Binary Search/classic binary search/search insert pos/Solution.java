// https://leetcode.com/problems/search-insert-position/

// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid= low+(high-low)/2;

            if(nums[mid]>target) high=mid-1;
            else if(nums[mid]<target) low=mid+1;
            else return mid;
        }
        // lower pos pr add hoga na
        return low;
    }
}