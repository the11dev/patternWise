// https://leetcode.com/problems/max-consecutive-ones/

// Input: nums = [1,1,0,1,1,1]
// Output: 3

// Input: nums = [1,0,1,1,0,1]
// Output: 2
 
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    // Sliding window
        int max=0,i=0,j=0;
        while(j<nums.length){
            if(nums[j]==1){
                max=Math.max(max,j-i+1);
            }else{
                i=j+1;
            }
            j++;
        }

    // counting 

        // int max=0,c=0;
        // for(int n:nums){
        //     if (n!=1){
        //         c=0;
        //     }else
        //         c++;

        //     max=Math.max(c,max);
        // }
        return max;
    }
}
