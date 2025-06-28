import java.util.*;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[k];

        // Pair values with their original indices
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums[i]; // value
            pairs[i][1] = i;       // original index
        }

        // Sort based on value descending
        Arrays.sort(pairs, (a, b) -> Integer.compare(b[0], a[0]));

        // Take top k elements
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            indices.add(pairs[i][1]);
        }

        // Sort the selected indices to preserve order
        Collections.sort(indices);

        // Build result array using original nums array
        for (int i = 0; i < k; i++) {
            result[i] = nums[indices.get(i)];
        }

        return result;
    }
}
