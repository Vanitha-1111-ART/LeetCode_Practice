class Solution {
    public int compress(char[] chars) {

        String ans = "";
        int c = 1;

        for (int i = 0; i < chars.length - 1; i++) {

            if (chars[i] == chars[i + 1]) {
                c++;
            } else {
                ans += chars[i];
                if (c != 1)
                    ans += c;

                c = 1;
            }
        }

        // Process the last group
        ans += chars[chars.length - 1];
        if (c != 1)
            ans += c;

        // Copy back
        for (int i = 0; i < ans.length(); i++) {
            chars[i] = ans.charAt(i);
        }

        return ans.length();
    }
}