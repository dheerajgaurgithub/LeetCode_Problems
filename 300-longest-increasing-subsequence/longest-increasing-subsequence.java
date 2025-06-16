class Solution {
    static int[][] dp;

    static int lisRecursion(int[] nums, int curr, int prev) {
        if (curr == nums.length)
            return 0;

        if (dp[curr][prev + 1] != -1)
            return dp[curr][prev + 1];

        int take = 0;
        if (prev == -1 || nums[curr] > nums[prev]) {
            take = 1 + lisRecursion(nums, curr + 1, curr);
        }

        int notTake = lisRecursion(nums, curr + 1, prev);

        return dp[curr][prev + 1] = Math.max(take, notTake);
    }

    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        dp = new int[n][n + 1];  // prev can be -1 to n-1, so size n+1
        for (int i = 0; i < n; i++)
            for (int j = 0; j <= n; j++)
                dp[i][j] = -1;

        return lisRecursion(nums, 0, -1);
    }
}
