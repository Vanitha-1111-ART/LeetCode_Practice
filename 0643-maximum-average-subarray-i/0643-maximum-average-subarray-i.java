class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double average=0;
        double maxaverage=0;
        int sum=0;
        for(int i=0;i<k;i++){
             sum+=nums[i];
        }
        average= (double)sum/k;
        maxaverage=average;
        int l=0,r=k-1;
        while(r<nums.length-1){
            sum=sum+nums[++r]-nums[l++];
            average= (double)sum/k;
            maxaverage=Math.max(average,maxaverage);
        }
        return maxaverage;
        
    }
}