class Solution {

    public void solveSudoku(char[][] board) {

        doing(board);
        
    }

    public boolean doing(char [][] board) {
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j] == '.') {

                    for(char c = '1'; c <= '9'; c++) {

                        if(isValid(i, j, board, c)) {
                            board[i][j] = c;

                            if(doing(board) == true) return true;

                            else board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    boolean isValid(int i, int j, char [][] board, char toPut) {

        // checking row
        for(int k = 0; k < 9; k++) {
            if(board[i][k] == toPut) return false;
        }

        // checking column
        for(int k = 0; k < 9; k++) {
            if(board[k][j] == toPut) return false;
        }

        // checking 3X3 matrix
        int row = i/3*3;
        int col = j/3*3;
        for(int p = row; p < row + 3; p++) {
            for(int q = col; q < col + 3; q++) {
                if(board[p][q] == toPut) return false;
            }
        }

        return true;

    }

}