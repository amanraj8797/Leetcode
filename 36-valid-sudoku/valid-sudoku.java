class Solution {
    public boolean check(int row, int col, char[][] board) {
        char c = board[row][col];
        board[row][col] = '-';
        // check in this row
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == c)
                return false;

        }

        // check in this col
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == c)
                return false;

        }

        // check in the subgrid
        int a = (row / 3) * 3;
        int b = (col / 3) * 3;

        for (int i = a; i < a + 3; i++) {
            for (int j = b; j < b + 3; j++) {
                if (board[i][j] == c)
                    return false;
            }
        }

        board[row][col] = c;

        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        // We just need to check if the given board is valid or not.  

        int n = board.length, m = board[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] != '.') {
                    if (!check(i, j, board))
                        return false;
                }
            }
        }

        return true;
    }
}