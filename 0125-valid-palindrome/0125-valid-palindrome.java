class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        s=s.replace(" ","");


        int i=0;
        int j=s.length()-1;
        System.out.print(s);
        while(j>i){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
            
        }
        return true;
    }
}