// https://leetcode.com/problems/rotate-array/description/

// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]


// TWO POINTER
// Time Complexity O(n)
// Space Comp O(n) -> temp arr 
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int[] temp = new int[n];

        // complexity = O(2n) = O(n)
        for(int i=0;i<n;i++){
            int newIdx=(i+k)%n;
            temp[newIdx]=nums[i];
        }

        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
    }
}

// REVERSAL ALGO - optimized
// Time Complexity O(n)
// Space Comp O(1) 
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n; // to make sure k is inside the bound(nums.length)
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }

    void reverse(int[] nums,int i,int j){
        while(i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}