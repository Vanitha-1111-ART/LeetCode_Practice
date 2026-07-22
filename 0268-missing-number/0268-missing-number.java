class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int c=0;
        Set<Integer> set=new HashSet<>();
        for(int j=0;j<n;j++){
            set.add(nums[j]);
        }
        if(n>0){
            for(int i=0;i<=n;i++){
                if(!set.contains(i)){
                return i;
            }
         }
            
        }
        return c;

        
    }
}