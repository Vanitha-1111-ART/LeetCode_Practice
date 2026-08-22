class Solution {
    public boolean checkDivisibility(int n) {
        int s=0;
        int p=1;
        int x=n;
        while(n>0){
            int r=n%10;
            p*=r;
            s+=r;
            n/=10;
        }
        int sum=p+s;
        int res=x%sum;
        return  res==0;
    }
}