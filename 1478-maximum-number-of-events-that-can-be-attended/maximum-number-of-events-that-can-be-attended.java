import java.util.*;

class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> a[0] - b[0]);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int day = 1, i = 0, res = 0;
        int n = events.length;

        // Find max day to loop over
        int maxDay = 0;
        for (int[] e : events)
            maxDay = Math.max(maxDay, e[1]);

        for (day = 1; day <= maxDay; day++) {
            // Add events starting today
            while (i < n && events[i][0] == day) {
                pq.offer(events[i][1]);
                i++;
            }

            // Remove events already ended
            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }

            // Attend event that ends earliest
            if (!pq.isEmpty()) {
                pq.poll();
                res++;
            }
        }

        return res;
    }
}
