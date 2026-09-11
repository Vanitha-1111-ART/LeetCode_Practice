class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int ans=0;
        while(n>0){
            int r=n%10;
            ans=10*ans+r;
            n/=10;
        }
        return ans==x;
    }
}