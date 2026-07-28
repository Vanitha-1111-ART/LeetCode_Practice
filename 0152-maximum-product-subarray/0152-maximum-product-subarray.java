class Solution {
    public int maxProduct(int[] nums) {
        int maxi=1,mini=1,cu=1,ans=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                   int temp=maxi;
                   maxi=mini;
                   mini=temp;
            }
            maxi=Math.max(nums[i],maxi*nums[i]);
            mini=Math.min(nums[i],mini*nums[i]);
            ans=Math.max(ans,maxi);
        }
        return ans;
        
    }
}