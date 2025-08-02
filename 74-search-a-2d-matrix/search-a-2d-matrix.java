class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;                  // no of rows
        int m = matrix[0].length;               // no of columns

        int low = 0;

        int high = n*m - 1;

        if(target < matrix[0][0] || target > matrix[n - 1][m - 1]) return false;

        while(low <= high) {

            int mid = low + (high - low)/2;

            int row = mid/m;
            int col = mid%m;

            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] > target) high = mid - 1;
            else low = mid + 1;

        }

        return false;
        
    }
}