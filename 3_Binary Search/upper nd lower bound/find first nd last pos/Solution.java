// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[]res= new int[2];
        res[0]=binarySearch(nums,target,true);
        res[1]=binarySearch(nums,target,false);
        return res;
    }

    private int binarySearch(int[] nums,int target,boolean startIdx){
        int low=0,
            high=nums.length-1,
            ans=-1;
        
        while(low<=high){
            int mid= low+(high-low)/2;

            if(nums[mid]<target)
                low=mid+1;
            else if(nums[mid]>target)
                high=mid-1;
            else{
                ans=mid;
                
                if(startIdx) // first occ : search lower half
                    high=mid-1;
                else //last occ : search upper half
                    low=mid+1;
            }
        }
        return ans;
    }
}