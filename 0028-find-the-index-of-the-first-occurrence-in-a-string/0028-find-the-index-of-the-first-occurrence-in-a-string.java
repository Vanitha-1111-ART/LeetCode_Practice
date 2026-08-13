class Solution {
    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)) return -1;
        int n=haystack.length();
        int j=needle.length();
        for(int i=0;i<=n-j;i++){
            int k=0;
            while(k<j && haystack.charAt(i+k)==needle.charAt(k)){
                k++;
            }
            if(k==j) return i;
        }
       return -1;
    }
}