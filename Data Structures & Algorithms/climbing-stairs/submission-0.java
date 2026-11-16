class Solution {
    int[] memo;
    public int climbStairs(int n) {
        memo = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = -1;
        }
        return solve(n);
    }

    private int solve(int n) {
        if (n == 0) return 1;
        if (n < 0) return 0;

        if (memo[n] != -1) return memo[n];

        int one = solve(n - 1);
        int two = solve(n - 2);

        return memo[n] = one + two;
    }
}