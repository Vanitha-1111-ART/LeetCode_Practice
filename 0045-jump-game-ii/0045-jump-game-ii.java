class Solution {
    public int jump(int[] nums) {
        int c=0;
        int n=nums.length;
        int far=0;
        int current=0;
        if(n<=1) return 0;
        for(int i=0;i<n-1;i++){
           far=Math.max(far,i+nums[i]);
           if(i==current){
            c++;
            current=far;
           }
           
        }
        return c;
    }
}