// https://leetcode.com/problems/palindromic-substrings/

// Input: s = "abc"
// Output: 3
// Explanation: Three palindromic strings: "a", "b", "c".

// Input: s = "aaa"
// Output: 6
// Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".

class Solution {
// DP ODD EVEN -optimised
    public int countSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            c+=expand(s,i,i);
            c+=expand(s,i,i+1);
        }
        return c;
    }
    int expand(String s, int i, int j){
        int c=0;
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            c++;
            i--;
            j++;
        }
        return c;
    }


    // two pointer
    int c=0;
    public int countSubstrings(String s) {
        int cnt=0;
        int n= s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s,i,j)){
                    cnt++;
                    if(c==2){
                        c=0;
                        break;
                    }
                }
            }
        }
        return cnt;
    }
     
    boolean isPalindrome(String s, int i,int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                c++;
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}