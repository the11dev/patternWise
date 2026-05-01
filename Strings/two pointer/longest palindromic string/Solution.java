// https://leetcode.com/problems/longest-palindromic-substring/

// Input: s = "babad"
// Output: "bab"

// TWO POINTER APPROACH
class Solution {
    public String longestPalindrome(String s) {
        int max=0;
        String res= s.substring(0,1);
        for(int i=0;i<s.length();i++){
            for(int j=i+max;j<=s.length();j++){
                if(j-i > max && isPalindrome(s.substring(i,j))){
                    max=j-i;
                    res=s.substring(i,j);
                }
            }
        }
        return res;
    }
    
    boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}

// EXPAND FROM CENTER APPROACH
class Solution {
    public String longestPalindrome(String s) {
        String maxStr= s.substring(0,1);
        for(int i=0;i<s.length();i++){
            String odd= expand(s,i,i);
            String even = expand(s,i,i+1);

            if(odd.length()>maxStr.length()) maxStr=odd;
            if(even.length()>maxStr.length()) maxStr=even;
        }
        return maxStr;
    }

    String expand(String s, int i,int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return s.substring(i+1,j);
    }
}


// DYNAMIC PROGRAMMING APPROACH
class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        boolean[][] dp =new boolean[n+1][n+1];
        int max=1, start=0, end=0;
        
        for(int i=0;i<n;i++){
            dp[i][i]=true;
            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j) && ( i-j<=2 || dp[j+1][i-1])){
                    dp[j][i]=true;
                    if(i-j+1>max){
                        max=i-j+1;
                        start=j;
                        end=i;
                    }
                }
            }
        }
        return s.substring(start,end+1);
    }
}
