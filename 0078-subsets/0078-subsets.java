class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backTrack(nums,res,new ArrayList<>(),0);
        return res;
    }
    public void backTrack(int[] nums,List<List<Integer>> res,List<Integer> cu,int s){
        res.add(new ArrayList<>(cu));
        for(int i=s;i<nums.length;i++){
            cu.add(nums[i]);
            backTrack(nums,res,cu,i+1);
            cu.remove(cu.size()-1);
        }
    }
}