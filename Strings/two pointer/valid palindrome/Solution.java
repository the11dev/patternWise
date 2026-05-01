// https://leetcode.com/problems/valid-palindrome/

// Input: s = "A man, a plan, a canal: Panama"
// Output: true

class Solution {
    public boolean isPalindrome(String s) {
        int i=0,
        j=s.length()-1;
        while(i<j){
            char l=s.charAt(i);
            char r=s.charAt(j);
            
            if(!Character.isLetterOrDigit(l)){
                i++;
                continue;
            } 
            if(!Character.isLetterOrDigit(r)){
                j--;
                continue;
            } 
            if(Character.toLowerCase(l)!=Character.toLowerCase(r)) 
                return false;

            i++;
            j--;
        }

        return true;
    }
}