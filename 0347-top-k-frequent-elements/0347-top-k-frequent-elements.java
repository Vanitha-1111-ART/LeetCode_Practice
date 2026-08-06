class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] res = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        for (int num : map.keySet()) {
            pq.offer(num);
        }

        for (int j = 0; j < k; j++) {
            res[j] = pq.poll();
        }
        return res;

    }
}