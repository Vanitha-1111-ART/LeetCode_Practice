class Solution {
    public int subtractProductAndSum(int n) {
        if(n==1) return 0;
        int p=1;
        int s=0;
        while(n>0){
            int re=n%10;
            p*=re;
            s+=re;
            n/=10;
        }
        return p-s;
        
    }
}