class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Character, Integer> sm = new HashMap<>();
        HashMap<Character, Integer> pm = new HashMap<>();
        boolean flag = true;
        int start = 0;
        int end = p.length() - 1;
        if(p.length()>s.length()) return ans;
        for (int i = 0; i < p.length(); i++) {
            pm.put(p.charAt(i), pm.getOrDefault(p.charAt(i), 0) + 1);
        }
        for (int i = 0; i < p.length(); i++) {
            sm.put(s.charAt(i), sm.getOrDefault(s.charAt(i), 0) + 1);
        }
         if(sm.equals(pm))ans.add(0);

        while (end < s.length() - 1) {
            sm.put(s.charAt(start), sm.get(s.charAt(start)) - 1);
            if (sm.get(s.charAt(start)) == 0)
                sm.remove(s.charAt(start));
            start++;
            end++;
            sm.put(s.charAt(end), sm.getOrDefault(s.charAt(end), 0) + 1);

            if(sm.equals(pm))ans.add(start);
            
                
        }
        return ans;

    }
}