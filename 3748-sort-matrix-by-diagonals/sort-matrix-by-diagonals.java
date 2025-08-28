import java.util.*;

class Solution {
    public int[][] sortMatrix(int[][] grid) {

        int n = grid.length;

        HashMap <Integer, ArrayList <Integer>> hm = new HashMap<>();

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {

                int key = Math.abs(i - j);
                if(hm.containsKey(key)) {
                    hm.get(key).add(grid[i][j]);
                } else {
                    ArrayList <Integer> list = new ArrayList<>();
                    list.add(grid[i][j]);
                    hm.put(key, list);
                }

            }
        }

        for(Map.Entry <Integer, ArrayList<Integer>> set: hm.entrySet()) {
            Collections.sort(set.getValue());
        }

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int key = Math.abs(i - j);
                grid[i][j] = hm.get(key).get(0);
                hm.get(key).remove(0);
            }
        }

        HashMap <Integer, ArrayList <Integer>> hmm = new HashMap<>();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {

                int key = Math.abs(i - j);
                if(hmm.containsKey(key)) {
                    hmm.get(key).add(grid[i][j]);
                } else {
                    ArrayList <Integer> list = new ArrayList<>();
                    list.add(grid[i][j]);
                    hmm.put(key, list);
                }

            }
        }

        for(Map.Entry <Integer, ArrayList<Integer>> set: hmm.entrySet()) {
            Collections.sort(set.getValue(), Collections.reverseOrder());
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                int key = Math.abs(i - j);
                grid[i][j] = hmm.get(key).get(0);
                hmm.get(key).remove(0);
            }
        }

        return grid;
        
    }
}
