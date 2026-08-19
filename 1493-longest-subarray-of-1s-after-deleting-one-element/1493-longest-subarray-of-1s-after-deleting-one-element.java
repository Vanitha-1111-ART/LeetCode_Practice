class Solution {
    public int longestSubarray(int[] nums) {
        int window = 0;
        int s = 0, e = 0;
        int zc = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zc++;
            }
            while (zc > 1) {
               if(nums[s]==0){
                zc--;
               }
                s++;
            }
            window=Math.max(window,i-s);

        }
      
        return window;

    }
}