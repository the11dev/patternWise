// https://www.geeksforgeeks.org/problems/ceil-in-a-sorted-array/1

class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int low=0,high=arr.length-1,ans=-1;
        
        while(low<=high){
            int mid= low+(high-low)/2;
            
            if(arr[mid]>x) {
            // posssible ans bt check left half
                ans=mid;
                high=mid-1;
            }else if(arr[mid]<x){
            // too small, check right half
                low=mid+1;
            }else if(arr[mid]==x){
            // possible ans, check first occ
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }
}
