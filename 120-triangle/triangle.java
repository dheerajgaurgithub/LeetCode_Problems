class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        for (int i = n - 2; i >= 0; i--) {
            List<Integer> current = triangle.get(i);
            List<Integer> below = triangle.get(i + 1);
            for (int j = 0; j < current.size(); j++) {
                int minPath = Math.min(below.get(j), below.get(j + 1));
                current.set(j, current.get(j) + minPath);
            }
        }
        return triangle.get(0).get(0); 
    }
}
