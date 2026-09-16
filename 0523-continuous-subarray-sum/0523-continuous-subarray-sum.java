class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
       HashMap<Integer,Integer> map=new HashMap<>();
       map.put(0,-1);
       int cu=0;
       for(int i=0;i<n;i++){
         cu+=nums[i];
        int re=cu%k;
        if(map.containsKey(re)){
            if(i-map.get(re)>=2){
                return true;
            }
        }
        else{
            map.put(re,i);
        }

       }
        return false;
    }
}