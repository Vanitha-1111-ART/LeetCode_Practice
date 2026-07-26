class Solution {
    public String removeDuplicateLetters(String s) {
        int[] last=new int[26];
        for(int i=0;i<s.length();i++){
            last[s.charAt(i)-'a']=i;
        }
        boolean[] seen=new boolean[26];
        Stack<Character> ans=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            if(seen[c-'a']){
                continue;
            }
            while(!ans.isEmpty() && c<ans.peek() && last[ans.peek()-'a']>i){
                seen[ans.pop()-'a']=false;
            }
            ans.push(c);
            seen[c-'a']=true;
        }
        StringBuilder S=new StringBuilder();
        for(char c:ans){
            S.append(c);
        }
        return S.toString();

    }
}