class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;
        int m = matrix[0].length;

        int i = 0;

        if(matrix[0][0] > target || matrix[n - 1][m - 1] < target) return false;

        for( ; i < n; i++) {

            if(target >= matrix[i][0] && target <= matrix[i][m - 1]) {
                break;
            }

        }

        if(i >= n) return false;

        int low = 0, high = m - 1;

        while(low <= high) {

            int mid = low + (high - low)/2;

            if(matrix[i][mid] == target) return true;

            else if(matrix[i][mid] > target) high = mid - 1;
            else low = mid + 1;

        }

        return false;
    }
}