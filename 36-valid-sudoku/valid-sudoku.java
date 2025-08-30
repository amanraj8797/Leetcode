class Solution {
    public boolean isValidSudoku(char[][] board) {

        // for each row
        for(int i = 0; i < 9; i++) {
            ArrayList <Character> list = new ArrayList<>();

            for(int j = 0; j < 9; j++) {
                if(list.contains(board[i][j]) && board[i][j] != '.') {
                    return false;
                }
                list.add(board[i][j]);
            }

        }

        // for each column
        for(int i = 0; i < 9; i++) {

            List <Character> list = new ArrayList<>();

            for(int j = 0; j < 9; j++) {
                if(list.contains(board[j][i]) && board[j][i] != '.') {
                    return false;
                }
                list.add(board[j][i]);
            }

        }

        // for each 3x3 matrix
        for(int i = 0; i < 9; i += 3) {

            ArrayList <Character> list1 = new ArrayList<>();
            for(int j = i; j < i + 3; j++) {
                for(int k = 0; k <= 2; k++) {
                    if(list1.contains(board[j][k]) && board[j][k] != '.') {
                        return false;
                    } 
                    list1.add(board[j][k]);
                }
            }

            ArrayList <Character> list2 = new ArrayList<>();
            for(int j = i; j < i + 3; j++) {
                for(int k = 3; k <= 5; k++) {
                    if(list2.contains(board[j][k]) && board[j][k] != '.') {
                        return false;
                    } 
                    list2.add(board[j][k]);
                }
            }

            ArrayList <Character> list3 = new ArrayList<>();
            for(int j = i; j < i + 3; j++) {
                for(int k = 6; k <= 8; k++) {
                    if(list3.contains(board[j][k]) && board[j][k] != '.') {
                        return false;
                    } 
                    list3.add(board[j][k]);
                }
            }

        }

        return true;
        
    }
}