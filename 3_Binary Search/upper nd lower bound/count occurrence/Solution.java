// https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1

// Given a sorted array, arr[] and a number target, you need to find the number of occurrences of target in arr[]. 

class Solution {
    int countFreq(int[] arr, int x) {
        // code here
        int first =binary(arr,x,true);
        if(first == -1) return 0;
        int last= binary(arr,x,false);
        return last-first+1;
    }
    
    int binary(int[] arr,int x, boolean flag){
        int low=0,high=arr.length-1;
        int c=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(arr[mid]>x) high=mid-1;
            else if(arr[mid]<x) low= mid+1;
            else { //arr[mid] == x
                c=mid;
                if(flag) high=mid-1; //first occ : search left
                else low=mid+1;     // last occ : search right
            }
        }
        return c;
    }
}
