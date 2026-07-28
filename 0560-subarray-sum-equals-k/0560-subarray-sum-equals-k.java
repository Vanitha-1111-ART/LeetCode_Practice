class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int pre=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int c=0;
        for(int i=0;i<n;i++){
           pre+=nums[i];
           int s=pre-k;
           if(map.containsKey(s)){
            c+=map.get(s);
            
           }
         map.put(pre,map.getOrDefault(pre,0)+1);

        }
        return c;

    }
}