// https://www.geeksforgeeks.org/problems/pair-with-given-sum-in-a-sorted-array4940/1

// Input: arr[] = [1, 1, 1, 1], target = 2
// Output: 6

// Input: arr[] = [-1, 1, 5, 5, 7], target = 6
// Output: 3
class Solution {

    int countPairs(int arr[], int target) {
        int i=0,j=arr.length-1, c=0;
        
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum<target) i++;
            else if(sum > target) j--;
            else{
                int a=arr[i], b=arr[j];
                if(a==b){
                    int x=j-i+1;
                    c+=(x*(x-1))/2;
                    break;
                }else{
                    int l=0, r=0;
                    while(i<=j && arr[i]==a){
                        i++;
                        l++;
                    }
                    while(j>=i && arr[j]==b){
                        j--;
                        r++;
                    }
                    
                    c+=l*r;
                }
            }
        }
        return c;
    }
}
