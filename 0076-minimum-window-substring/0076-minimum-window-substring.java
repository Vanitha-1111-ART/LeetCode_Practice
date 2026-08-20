class Solution {
    public String minWindow(String s, String t) {
        int[] fre = new int[128];
        //int[] fre2=new int[26];
        if (s.length() < t.length()) {
            return "";
        }
        for (int i = 0; i < t.length(); i++) {
            fre[t.charAt(i)]++;
        }
        int l = 0, r = 0;
        int mins = 0;
        int minlen = Integer.MAX_VALUE;
        int needed = t.length();
        while (r < s.length()) {
            char c = s.charAt(r);
            if (fre[c] > 0)
                needed--;
            fre[c]--;
            r++;

            while (needed == 0) {
                if (r - l < minlen) {
                    minlen = r - l;
                    mins = l;
                }
                char ch = s.charAt(l);
                fre[ch]++;
                if (fre[ch] > 0) {
                    needed++;
                }
                 l++;
               
            }
        }
        if(minlen==Integer.MAX_VALUE) return "";
    return s.substring(mins,minlen+mins);

    }
}