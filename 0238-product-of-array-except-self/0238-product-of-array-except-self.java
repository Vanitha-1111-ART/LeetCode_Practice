class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        int[] pre=new int[nums.length];
        int[] suf=new int[nums.length];
        int n=nums.length,p=1,s=1;
        pre[0]=1;suf[n-1]=1;
        for(int i=1;i<n;i++){
             p*=nums[i-1];
             pre[i]=p;   
            }
            for(int i=n-2;i>=0;i--){
             s*=nums[i+1];
             suf[i]=s;   
            }
            for(int i=0;i<n;i++){
                arr[i]=pre[i]*suf[i];
            }

    
    return arr;


    }
}