class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> sm=new HashMap<>();
        HashMap<Character,Character> tm=new HashMap<>();
        int sn=s.length();
        int tn=t.length();
        if(sn!=tn) return false;
        for(int i=0;i<sn;i++){
            if(!sm.containsKey(s.charAt(i)) && !tm.containsKey(t.charAt(i))){
            sm.put(s.charAt(i),t.charAt(i) );
            tm.put(t.charAt(i),s.charAt(i));    
            }
            else if(sm.containsKey(s.charAt(i)) && tm.containsKey(t.charAt(i))){
            if(tm.get(t.charAt(i))!=s.charAt(i) || sm.get(s.charAt(i))!=t.charAt(i))return false;
            }
            else{
                return false;
            }
        }

            
        
        return true;

    }
    
}