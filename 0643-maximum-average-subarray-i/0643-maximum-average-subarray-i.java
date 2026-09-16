class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int[] pre=new int[n];
        int cu=0;
        for(int i=0;i<n;i++){
            cu+=nums[i];
            pre[i]=cu;
        }
         System.out.println(Arrays.toString(pre));
       double ma=(double)(pre[k-1])/k;
       int j=0;
        for(int i=k;i<n;i++){
            double ans=( double)(pre[i]-pre[j++])/k;
            ma= Math.max(ma,ans);
            
            
        }
        return ma;
        
    }
}