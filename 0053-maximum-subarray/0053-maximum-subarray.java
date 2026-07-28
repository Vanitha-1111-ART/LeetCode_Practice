class Solution {
    public int maxSubArray(int[] nums) {
        int maxi=nums[0];
        int cu=0;
        for(int i=0;i<nums.length;i++){
             cu += nums[i];
            maxi=Math.max(maxi,cu);
            if(cu<0) cu=0;
        }
        return maxi;
    }
}