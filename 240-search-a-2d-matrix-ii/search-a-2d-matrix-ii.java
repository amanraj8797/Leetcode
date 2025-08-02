class Solution {

    boolean binarySearchRow(int [] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {
            int mid = low + (high - low)/2;

            if(arr[mid] == target) return true;
            else if(arr[mid] > target) high = mid - 1;
            else low = mid + 1;

        }

        return false;
    }

    boolean binarySearchCol(int [][] mat, int i, int j, int target) {

        int low = i;
        int high = mat.length - 1;

        while(low <= high) {

            int mid = low + (high - low)/2;

            if(mat[mid][j] == target) return true;
            else if(mat[mid][j] > target) high = mid - 1;
            else low = mid + 1;

        }

        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;

        int col = matrix[0].length - 1;

        for(int row = 0; row < n; row++) {

            if(matrix[row][0] <= target && matrix[row][col] >= target) {
                if(binarySearchRow(matrix[row], target) == true) return true;
            }else if(matrix[row][col] >= target && matrix[n - 1][col] >= target) {
                if(binarySearchCol(matrix, row, col, target) == true) return true;
            }

        }

        return false;
        
    }
}