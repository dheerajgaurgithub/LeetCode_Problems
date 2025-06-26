class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length;
        int column = mat[0].length;
        int[][] arr = new int[row][column];
        int count = row + column; // a max possible distance

        // First Pass: Top-Left to Bottom-Right
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (mat[i][j] == 0) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = count;
                    if (i > 0) {
                        arr[i][j] = Math.min(arr[i][j], arr[i - 1][j] + 1);
                    }
                    if (j > 0) {
                        arr[i][j] = Math.min(arr[i][j], arr[i][j - 1] + 1);
                    }
                }
            }
        }

        // Second Pass: Bottom-Right to Top-Left
        for (int i = row - 1; i >= 0; i--) {
            for (int j = column - 1; j >= 0; j--) {
                if (i < row - 1) {
                    arr[i][j] = Math.min(arr[i][j], arr[i + 1][j] + 1);
                }
                if (j < column - 1) {
                    arr[i][j] = Math.min(arr[i][j], arr[i][j + 1] + 1);
                }
            }
        }

        return arr;
    }
}
