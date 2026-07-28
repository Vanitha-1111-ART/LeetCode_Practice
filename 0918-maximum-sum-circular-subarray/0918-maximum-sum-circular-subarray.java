class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsum = nums[0];
        int maxcu = 0,minsum=nums[0],mincu=0,total=0,ans=0;
        for (int i = 0; i < nums.length; i++) {
           mincu+=nums[i];
           minsum=Math.min(minsum,mincu);
           if(mincu>0) mincu=0;

           maxcu+=nums[i];
           maxsum=Math.max(maxsum,maxcu);
           if(maxcu<0) maxcu=0;

           total+=nums[i];

        }
        if(maxsum<0) return maxsum;
        ans=Math.max(maxsum,total-minsum);
        return ans;
    }
}