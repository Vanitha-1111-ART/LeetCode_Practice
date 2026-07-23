class Solution {
    public int alternateDigitSum(int n) {
        long x=n;
        int sum=0;
        long digit=1;
        int c=0;
        while(n>0){
            digit*=10;
            c++;
            n/=10;
        }
        digit/=10;
        for(int i=0;i<c;i++){
            if(x!=0){
            if(i%2==0){
                sum+= (int)x/digit;
            }
            else{
                sum-=(int)x/digit;
            }
            x%=digit;
            digit/=10;
            }
            
        }
        return sum;

        
    }
}