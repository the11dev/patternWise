// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

// Example 1:
// Input: numbers = [2,7,11,15], target = 9
// Output: [1,2]

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res =new int[2];
        int i=0,j=nums.length-1;
        while(i<j){
            int sum=nums[i]+nums[j];
            if(sum<target) i++;
            else if(sum>target) j--;
            else{
                res[0]=i+1;
                res[1]=j+1;
                break;
            }
        }

        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             res[0]=i+1;
        //             res[1]=j+1;
        //             break;
        //         }
        //     }
        // }
        return res;
    }
}
