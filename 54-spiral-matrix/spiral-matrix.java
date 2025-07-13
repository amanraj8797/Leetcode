class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        ArrayList <Integer> ans = new ArrayList<>();

        int top = 0;
        int bottom = row - 1;
        int left = 0;
        int right = col - 1;

        int count = 0;

        // count <= row * col
        while(left <= right && top <= bottom) {

            // left -> right

            for(int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
                count++;
            }
            top++;

            // top -> bottom
            for(int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
                count++;
            }
            right--;

            // right -> left            
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                    count++;
                }
                bottom--;
            }

            // bottom -> top
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                    count++;
                }
                left++;
            }
        }

        return ans;
    }
}