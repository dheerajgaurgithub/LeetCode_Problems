class Solution {
    public int maxProduct(int[] nums) {
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int n = nums[i];

            if (n < 0) {
                // Swap because negative flips max and min
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            maxSoFar = Math.max(n, maxSoFar * n);
            minSoFar = Math.min(n, minSoFar * n);

            result = Math.max(result, maxSoFar);
        }

        return result;
    }
}
