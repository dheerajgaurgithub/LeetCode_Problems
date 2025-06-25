class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] prefix = new int[1001];  
        // Difference array update
        for (int[] trip : trips) {
            int passengers = trip[0];
            int start = trip[1];
            int end = trip[2];

            prefix[start] += passengers;
            prefix[end] -= passengers;
        }

        // Prefix sum and capacity check
        int currentPassengers = 0;
        for (int i = 0; i <= 1000; i++) {
            currentPassengers += prefix[i];
            if (currentPassengers > capacity) {
                return false;
            }
        }

        return true;
    }
}
