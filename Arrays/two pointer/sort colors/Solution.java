// https://leetcode.com/problems/sort-colors/

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]

class Solution {
    public void sortColors(int[] nums) {
        // DUTCH FLAG LOGIC
        int i=0, j=nums.length-1, k=0;
        while(k<=j){
            if(nums[k]==0){
                int temp=nums[k];
                nums[k]=nums[i];
                nums[i]=temp;
                i++;
                k++;
            }else if(nums[k]==2){
                int temp=nums[k];
                nums[k]=nums[j];
                nums[j]=temp;
                j--;
            }else
                k++;
        }

        // int z=0,o=0;
        // for(int n:nums){
        //     if(n==0) z++;
        //     else if(n==1) o++;
        // }
        // int i=0;
        // while(z-->0) nums[i++]=0;
        // while(o-->0) nums[i++]=1;
        // while(i<nums.length) nums[i++]=2;

    }
}