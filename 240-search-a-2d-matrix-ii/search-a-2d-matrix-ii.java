class Solution {

    // finding target in each ith row of matrix
    boolean binarySearch(int [] rowi, int find) {

        int low = 0, high = rowi.length - 1;

        while(low <= high) {
            int mid = low + (high - low)/2;

            if(rowi[mid] == find) return true;
            else if(rowi[mid] > find) high = mid - 1;
            else low = mid + 1;

        }

        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;
        int m = matrix[0].length;

        // going to each row and do binary search and find target
        for(int i = 0; i < n; i++) {
            if(binarySearch(matrix[i], target) == true) return true;
        } 

        return false;
    }
}