class Solution {
    public int longestSubsequence(String s, int k) {
        int count = 0;
        long value = 0;
        int power = 0;

        // Start from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            
            if (c == '0') {
                // Always add 0
                count++;
            } else {
                // Only add '1' if it doesn't exceed k
                if (power < 32) { // Avoid overflow
                    long bitValue = 1L << power;
                    if (value + bitValue <= k) {
                        value += bitValue;
                        count++;
                    }
                }
            }
            power++;
        }

        return count;
    }
}

