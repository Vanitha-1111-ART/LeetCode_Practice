class Solution {
    public int numberOfSteps(int num) {
        int c=0;
        int n=num;
        while(n>0){
            if(n%2==0){
                c++;
                n/=2;
            }
            else{
                n=n-1;
                c++;
            }
        }
        return c;
        
    }
}