import java.util.*;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        // Edge case: if the input array is empty, return an empty list
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        // Sort the array to ensure we check divisibility in increasing order
        Arrays.sort(nums);

        int n = nums.length;
        int[] dp = new int[n];  // dp[i] will store the size of the largest subset ending at nums[i]
        int[] parent = new int[n];  // parent[i] will store the index of the previous number in the subset
        int maxSize = 0;  // to track the size of the largest subset found
        int maxIndex = -1;  // to track the index where the largest subset ends

        // Initialize dp array (each element can form a subset of size 1)
        Arrays.fill(dp, 1);
        Arrays.fill(parent, -1);

        // Dynamic programming to fill dp and parent arrays
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {  // nums[i] is divisible by nums[j]
                    if (dp[i] < dp[j] + 1) {  // If including nums[i] creates a larger subset
                        dp[i] = dp[j] + 1;  // Update the size of the subset ending at nums[i]
                        parent[i] = j;  // Set parent[i] to j, indicating that nums[i] follows nums[j]
                    }
                }
            }

            // Track the maximum size subset
            if (dp[i] > maxSize) {
                maxSize = dp[i];
                maxIndex = i;
            }
        }

        // Reconstruct the largest divisible subset
        List<Integer> result = new ArrayList<>();
        while (maxIndex != -1) {
            result.add(nums[maxIndex]);
            maxIndex = parent[maxIndex];
        }

        // Reverse the result to maintain the correct order
        Collections.reverse(result);
        return result;
    }
}