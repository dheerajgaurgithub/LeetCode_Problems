class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int ans = n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < baskets.length; j++) {
                if (fruits[i] <= baskets[j]) {
                    ans--;
                    baskets[j] = 0;  // Mark the basket as used
                    break;
                }
            }
        }

        return ans;
    }
}
