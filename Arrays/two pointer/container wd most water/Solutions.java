// https://leetcode.com/problems/container-with-most-water/

// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49 i.e [1,8,6,2,5,4,8,3,7]

class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,max=Integer.MIN_VALUE;
        while(i<j){
            int h=Math.min(height[i],height[j]);
            int s=j-i;
            int area=h*s;
            max=Math.max(area,max);
            
            // using while we skip unnecessary comparisons
            while(i<j && height[i]<=h) i++;
            while(i<j && height[j]<=h) j--;

            // if(height[i]==h) i++;
            // else j--;
        }
        return max;
    }
}