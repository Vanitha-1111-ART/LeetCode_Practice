class Solution {
    boolean isAlphanumeric(char c) {
        if ((c <= 'Z' && c >= 'A') || (c >= 'a' && c <= 'z') || (c <= '9' && c >= '0')) {
            return true;
        }
        return false;
    }

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        s=s.toLowerCase();

        while (i < j) {

            if (isAlphanumeric(s.charAt(i)) && isAlphanumeric(s.charAt(j))) {
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            } else {
                if (!isAlphanumeric(s.charAt(i))) {
                    i++;
                    continue;
                }
                if (!isAlphanumeric(s.charAt(j))) {
                    j--;
                    ;
                    continue;
                }
            }
        }
        return true;

    }
}