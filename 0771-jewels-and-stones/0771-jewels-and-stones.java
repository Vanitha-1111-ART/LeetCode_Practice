class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n=stones.length();
        int c=0;
        HashMap <Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(stones.charAt(i),map.getOrDefault(stones.charAt(i),0)+1);
        }
        for(int j=0;j<jewels.length();j++){
            if(map.containsKey(jewels.charAt(j))){
                c=c+map.get(jewels.charAt(j));
            }
        }
        return c;
        
    }
}