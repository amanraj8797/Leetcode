class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int row = mat.length;
        int col = mat[0].length;

        TreeMap <Integer, ArrayList<Integer>> hm = new TreeMap<>();

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                ArrayList<Integer> list = new ArrayList<>();

                if(hm.containsKey(i + j)) {
                    hm.get(i + j).add(mat[i][j]);
                } else {
                    list.add(mat[i][j]);
                    hm.put((i + j), list);
                }
            }
        }

        int [] ans = new int[row*col];

        int c = 1;
        int x = 0;

        for(Map.Entry<Integer, ArrayList<Integer>> set : hm.entrySet()) {
            if(c % 2 == 0) {
                for(int i = 0; i < set.getValue().size(); i++) {
                    ans[x++] = set.getValue().get(i);
                }
            } else {
                for(int i = set.getValue().size() - 1; i >= 0; i--) {
                    ans[x++] = set.getValue().get(i);
                }
            }
            c++;
        }

        return ans;
        
    }
}