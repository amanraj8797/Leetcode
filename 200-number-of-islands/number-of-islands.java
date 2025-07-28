class Solution {

    void doing(char [][] board, int i, int j, int r, int c) {

        Queue <int []> Q = new LinkedList<>();

        int [][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        Q.add(new int[]{i, j});

        board[i][j] = '0';

        while(!Q.isEmpty()) {

            int[] pos = Q.poll();

            int xi = pos[0];
            int xj = pos[1];

            for(int [] d: dir) {

                int pi = xi + d[0];
                int pj = xj + d[1];

                if(pi >= 0 && pj >= 0 && pi < r && pj < c && board[pi][pj] == '1') {
                    Q.add(new int[]{pi, pj});
                    board[pi][pj] = '0';
                }
                
            }
        }

    }
    public int numIslands(char[][] grid) {
        
        int r = grid.length;
        int c = grid[0].length;

        int ans = 0;

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(grid[i][j] == '1') {
                    ans++;
                    doing(grid, i, j, r, c);
                }
            }
        }

        return ans;        
    }
}