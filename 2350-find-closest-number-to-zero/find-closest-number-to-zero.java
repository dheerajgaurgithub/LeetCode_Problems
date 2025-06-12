
class Solution {
    public int findClosestNumber(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> {
                int absA = Math.abs(a);
                int absB = Math.abs(b);
                if (absA != absB) {
                    return absA - absB; // smaller absolute value first
                } else {
                    return b - a; // larger number first if same abs value
                }
            }
        );

        for (int num : nums) {
            pq.offer(num);
        }
        return pq.peek(); 
    }
}
