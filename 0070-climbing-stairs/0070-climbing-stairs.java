class Solution {
    public int climbStairs(int n) {
        int c=0;
        int a=1,b=2;
        if(n>2){
            for(int i=3;i<=n;i++){
                int next=a+b;
                a=b;
                b=next;
                c=next;
            }
        }
        else if(n==1) return a;
        else if(n==2) return b;
    return c;
    }
}