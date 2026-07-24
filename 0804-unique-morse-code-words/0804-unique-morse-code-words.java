class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set=new HashSet<>();
        
        for(int i=0;i<words.length;i++){
            String ans="";
            boolean mor=true;
            String word=words[i];
            for(int j=0;j<word.length();j++){
               ans+=morse[word.charAt(j)-'a'];
            }
            set.add(ans);
        }
        return set.size();
    }
}