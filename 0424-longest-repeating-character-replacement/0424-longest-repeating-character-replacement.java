class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int maxfr=0;
        int ans=0;
        int[] freq=new int[26];
        for(int j=0;j<s.length();j++){
            freq[s.charAt(j)-'A']++;
            maxfr= Math.max(maxfr, freq[s.charAt(j)-'A']);
            int win=j-l+1;
            int replace=win-maxfr;
            if(replace>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            ans=Math.max(ans, j-l + 1);
         
        }
        return ans;
    }
}