class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
       Set<List<Integer>> ans=new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            int l=i+1;
            int r=n-1;
            
            while(l<r){
                if(nums[i]+nums[l]+nums[r]<0){
                    l++;
                }
               else if(nums[i]+nums[l]+nums[r]==0){
                    List<Integer> ans1=new ArrayList<>();
                   ans1.add(nums[i]);
                   ans1.add(nums[l]);
                   ans1.add(nums[r]);
                   l++;
                   r--;
                   ans.add(ans1);
                }
               else if(nums[i]+nums[l]+nums[r]>0){
                      r--;
                }
            }


        }
        return new ArrayList<>(ans);
        
    }
}