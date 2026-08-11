class Solution {
    public String convert(String s, int numsRows) {
        if(numsRows==1 ||s.length()<=numsRows) return s;
        StringBuilder[] sb=new StringBuilder[numsRows];
        for(int i=0;i<numsRows;i++){
            sb[i]=new StringBuilder();
        }
        int k=0;
        int st=1;
        for(char c: s.toCharArray()){
            sb[k].append(c);
            if(k==0){
                st=1;
            }else if(k==numsRows-1){
                st=-1;
            }
            k+=st;
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<sb.length;i++){
            res.append(sb[i]);
        }
        return res.toString();
        
    }
}