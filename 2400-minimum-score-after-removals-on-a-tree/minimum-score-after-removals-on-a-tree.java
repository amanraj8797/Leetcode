import java.util.*;

public class Solution {
    private int[] nums;
    private List<Integer>[] tree;
    private int[] subtreeXor;
    private int[] inTime, outTime;
    private int time = 0;
    private int totalXor;

    public int minimumScore(int[] nums, int[][] edges) {
        int n = nums.length;
        this.nums = nums;
        this.tree = new ArrayList[n];
        this.subtreeXor = new int[n];
        this.inTime = new int[n];
        this.outTime = new int[n];

        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            tree[edge[0]].add(edge[1]);
            tree[edge[1]].add(edge[0]);
        }

        dfs(0, -1);

        totalXor = subtreeXor[0];
        int minScore = Integer.MAX_VALUE;

        // Store edges in parent->child form based on DFS traversal
        List<int[]> edgeList = new ArrayList<>();
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            if (inTime[u] < inTime[v]) {
                edgeList.add(new int[]{u, v}); // u is parent of v
            } else {
                edgeList.add(new int[]{v, u}); // v is parent of u
            }
        }

        int m = edgeList.size();
        for (int i = 0; i < m; i++) {
            int aParent = edgeList.get(i)[0], aChild = edgeList.get(i)[1];

            for (int j = i + 1; j < m; j++) {
                int bParent = edgeList.get(j)[0], bChild = edgeList.get(j)[1];

                int xorA = subtreeXor[aChild];
                int xorB = subtreeXor[bChild];

                int xor1, xor2, xor3;

                if (isAncestor(aChild, bChild)) {
                    xor1 = xorB;
                    xor2 = xorA ^ xorB;
                    xor3 = totalXor ^ xorA;
                } else if (isAncestor(bChild, aChild)) {
                    xor1 = xorA;
                    xor2 = xorB ^ xorA;
                    xor3 = totalXor ^ xorB;
                } else {
                    xor1 = xorA;
                    xor2 = xorB;
                    xor3 = totalXor ^ xorA ^ xorB;
                }

                int max = Math.max(xor1, Math.max(xor2, xor3));
                int min = Math.min(xor1, Math.min(xor2, xor3));
                minScore = Math.min(minScore, max - min);
            }
        }

        return minScore;
    }

    private void dfs(int node, int parent) {
        subtreeXor[node] = nums[node];
        inTime[node] = ++time;

        for (int neighbor : tree[node]) {
            if (neighbor != parent) {
                dfs(neighbor, node);
                subtreeXor[node] ^= subtreeXor[neighbor];
            }
        }

        outTime[node] = ++time;
    }

    private boolean isAncestor(int u, int v) {
        // Checks if u is ancestor of v using DFS in/out times
        return inTime[u] <= inTime[v] && outTime[v] <= outTime[u];
    }
}
