class Solution {
    public int numIdenticalPairs(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int ans = 0;

        for (int num : nums) {

            int freq = map.getOrDefault(num, 0);

            ans += freq;

            map.put(num, freq + 1);
        }

        return ans;
    }
}