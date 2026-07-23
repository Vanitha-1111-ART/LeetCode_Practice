class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int r=ransomNote.length();
        int m=magazine.length();
        HashMap<Character,Integer> rm1=new HashMap<>();
        HashMap<Character,Integer> mm1=new HashMap<>();
        for(int i=0;i<r;i++){
            rm1.put(ransomNote.charAt(i),rm1.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for(int i=0;i<m;i++){
            mm1.put(magazine.charAt(i),mm1.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(char x:rm1.keySet()){
            if(rm1.get(x)>mm1.getOrDefault(x,0)) return false;
        }
        return true;

        
    }
}
