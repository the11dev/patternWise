//  https://leetcode.com/problems/move-zeroes/
// Example 1:
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]

class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        for(int n : nums){
            if(n!=0) nums[i++]=n;
        }
        while(i<nums.length){
            nums[i++]=0;
        }

        // // inplace , in one loop
        // int j=0;  //writer var
        // for(int i=0;i<nums.length;i++){ //reader var
        //     if(nums[i]!=0){
        //         int temp=nums[i];
        //         nums[i]=0;
        //         nums[j++]=temp; 
        //     }
        // }
    }
}