class Solution {
    static void dfs(int node, int[][] isConnected, int[] visited, int V) {
        visited[node] = 1;
        for (int j = 0; j < V; j++) {
            if (isConnected[node][j] == 1 && visited[j] == 0) {
                dfs(j, isConnected, visited, V);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;
        int[] visited = new int[V];
        int count = 0;

        for (int i = 0; i < V; i++) {
            if (visited[i] == 0) {
                count++;
                dfs(i, isConnected, visited, V);
            }
        }

        return count;
    }
}
