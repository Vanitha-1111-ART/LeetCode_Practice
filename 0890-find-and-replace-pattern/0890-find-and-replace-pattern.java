class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            boolean flag = true;
            HashMap<Character, Character> pmap = new HashMap<>();
             HashMap<Character, Character> wmap = new HashMap<>();
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                if (!pmap.containsKey(pattern.charAt(j))) {
                    pmap.put(pattern.charAt(j), word.charAt(j));
                    if (wmap.containsKey(word.charAt(j))) {
                        flag = false;
                        break;
                    }
                    wmap.put(word.charAt(j), pattern.charAt(j));

                } else {
                    if (pmap.get(pattern.charAt(j)) != word.charAt(j)
                            || wmap.get(word.charAt(j)) != pattern.charAt(j)) {
                        flag = false;
                        break;

                    }
                }

            }
            if (flag)
                ans.add(word);
        }
        return ans;

    }
}