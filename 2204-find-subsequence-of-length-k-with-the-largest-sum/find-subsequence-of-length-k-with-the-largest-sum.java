import java.util.*;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;

        // Step 1: Copy nums with index
        int[][] pair = new int[n][2];
        for (int i = 0; i < n; i++) {
            pair[i][0] = nums[i]; // value
            pair[i][1] = i;        // index
        }

        // Step 2: Sort by value descending
        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));

        // Step 3: Take top k elements
        Arrays.sort(pair, 0, k, Comparator.comparingInt(a -> a[1])); // sort by original index

        // Step 4: Build result
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pair[i][0];
        }

        return result;
    }
}
