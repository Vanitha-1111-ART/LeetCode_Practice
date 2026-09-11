class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> res=new ArrayList<>();
       
        for(int i=left;i<=right;i++){
            boolean flag=true;
            int c=i;
            int t=i;
            while(t>0){
              int r=t%10;
              if(r==0   || c%r!=0 ){
                 flag=false;
                 break;
              }
              t/=10;
            }
            if(flag){
                res.add(c);
            }
        }
        return res;
    }
}