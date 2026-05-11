// https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1

class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int l=0,h=arr.length-1,ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            
            if(arr[mid]>x) 
            // too big, check left
                h=mid-1;
            else if(arr[mid]<x){ 
            // possible ans , store check right side
                ans=mid;
                l=mid+1;
            }else{  
            // found target , check last occ
                ans=mid;
                l=mid+1;
            }
        }
        return ans;
    }
}
