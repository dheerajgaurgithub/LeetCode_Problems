class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>(); 
        
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                answer[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return answer;
    }
}
