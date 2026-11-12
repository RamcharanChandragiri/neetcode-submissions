class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), new boolean[nums.length], res);
        return res;
    }
    private void backtrack(int[] nums, List<Integer> current, boolean[] visited, List<List<Integer>> res) {
        // Base case: if our current permutation is the same size as nums, we found one
        if (current.size() == nums.length) {
            res.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;

            // Choose
            visited[i] = true;
            current.add(nums[i]);

            // Explore
            backtrack(nums, current, visited, res);

            // Un-choose (backtrack)
            current.remove(current.size() - 1);
            visited[i] = false;
        }
    }
}
