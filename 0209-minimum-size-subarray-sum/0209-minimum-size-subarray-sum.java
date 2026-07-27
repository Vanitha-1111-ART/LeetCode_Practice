class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int window=nums[0];
        int start=0;
        int end=0;
        int minl=Integer.MAX_VALUE;
        if(window>=target){
           return 1;
        }
        while(end<nums.length-1){
            end++;
            window+=nums[end];
            while(window>=target){
                minl=Math.min(minl,end-start+1);
                window-=nums[start];
                start++;
                
            }
            
        }
        return (minl==Integer.MAX_VALUE?0:minl);
        
    }
}