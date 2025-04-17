class Solution {
    public void setZeroes(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;

        // boolean [][] visit = new int[r][c];

        ArrayList <Integer> row0 = new ArrayList<>();
        ArrayList <Integer> col0 = new ArrayList<>();

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(matrix[i][j] == 0) {
                    // visit[i][j] = true;
                    row0.add(i);
                    col0.add(j);
                }
            }
        }

        int p = row0.size();
        int q = col0.size();

        for(int j = 0; j < p; j++) {
            for(int i = 0; i < c; i++) {
                System.out.print(j+" "+i);
                matrix[row0.get(j)][i] = 0;
            }
        }

        for(int j = 0; j < q; j++) {
            for(int i = 0; i < r; i++) {
                System.out.print(j+" "+i);
                matrix[i][col0.get(j)] = 0;
            }
        }
        
    }
}