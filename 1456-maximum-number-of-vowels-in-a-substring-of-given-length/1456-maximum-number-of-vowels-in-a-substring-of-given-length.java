class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> arr = new HashSet<>(
                Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int maxcount = 0;
        int c = 0;
        for (int i = 0; i < k; i++) {
            if (arr.contains(s.charAt(i))) {
                c++;
                maxcount = Math.max(maxcount, c);
            }
        }
        int start = 0;
        int end = k ;
        while (end < s.length() ) {
            if (arr.contains(s.charAt(start))) {

                c--;
            }

            if (arr.contains(s.charAt(end))) {
                c++;
            }

            maxcount = Math.max(maxcount, c);
            start++;
            end++;

        }
        return maxcount;
    }
}