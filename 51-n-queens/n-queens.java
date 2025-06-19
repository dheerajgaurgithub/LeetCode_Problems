class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        int[][] board = new int[n][n];
        solve(0, board, solutions);
        return solutions;
    }

    private void solve(int row, int[][] board, List<List<String>> solutions) {
        int n = board.length;
        if (row == n) {
            solutions.add(constructBoard(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;
                solve(row + 1, board, solutions);
                board[row][col] = 0; // backtrack
            }
        }
    }

    private boolean isSafe(int[][] board, int row, int col) {
        int n = board.length;

        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) return false;
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) return false;
        }

        return true;
    }

    private List<String> constructBoard(int[][] board) {
        List<String> res = new ArrayList<>();
        for (int[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (int cell : row) {
                sb.append(cell == 1 ? 'Q' : '.');
            }
            res.add(sb.toString());
        }
        return res;
    }
}
