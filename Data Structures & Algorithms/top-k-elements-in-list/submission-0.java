class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Count the frequency of each number
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // 2. Create buckets where index = frequency
        // Max possible frequency is nums.length
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            buckets[freq].add(num);
        }

        // 3. Collect the top k elements starting from the highest frequency bucket
        int[] res = new int[k];
        int index = 0;
        for (int i = buckets.length - 1; i >= 0 && index < k; i--) {
            for (int num : buckets[i]) {
                res[index++] = num;
                if (index == k) {
                    return res;
                }
            }
        }

        return res;
    }
}