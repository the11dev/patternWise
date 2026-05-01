// https://leetcode.com/problems/valid-palindrome-ii/

// Input: s = "aba"
// Output: true

// Input: s = "abca"
// Output: true

class Solution {
    public boolean validPalindrome(String s) {
        int i=0, j= s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return palindromeHelper(i+1,j,s) || palindromeHelper(i,j-1,s);
            }
            i++;
            j--;
        }
        return true;
    }
    
    public boolean palindromeHelper(int i,int j,String s){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}