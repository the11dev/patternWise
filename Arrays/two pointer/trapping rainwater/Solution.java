// https://leetcode.com/problems/trapping-rain-water/description/

// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6

class Solution {
    public int trap(int[] height) {
        int i=0,j=height.length-1,
        lmax=0,rmax=0,
        res=0;

        // min(max height on left, max height on right) - height[i]
        
        while(i<j){
            lmax=Math.max(lmax,height[i]);
            rmax=Math.max(rmax,height[j]);

            if(lmax<rmax){
                res+=lmax-height[i];
                i++;
            }else{
                res+=rmax-height[j];
                j--;
            }
        }
        return res;
    }
}