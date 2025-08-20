class Solution {
    public int countSquares(int[][] matrix) {

        int ans = 0;

        int row = matrix.length;
        int col = matrix[0].length;

        int [][] dp = new int[row][col];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {

                if((i == 0 || j == 0) && matrix[i][j] == 1) {
                    dp[i][j] = 1;
                    ans += 1;
                }else if(matrix[i][j] == 1) {
                    int min = Math.min(dp[i - 1][j], dp[i][j - 1]);
                    min = Math.min(dp[i - 1][j - 1], min);

                    dp[i][j] = min + 1;
                    ans += min + 1;
                }

            }
        }

        return ans;
        
    }
}