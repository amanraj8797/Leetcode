class Solution {
    
    public int solvetab(int[] coins, int amount) {
        int n = coins.length;
        int[] dp = new int[amount + 1];
        // Initialize dp array with maximum value
        for (int i = 0; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < n; j++) {
                if (i - coins[j] >= 0 && dp[i - coins[j]] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                }
            }
        }
        
        // If dp[amount] = maximum value, it means we can't do so
        if (dp[amount] == Integer.MAX_VALUE) {
            return -1;
        }
        
        return dp[amount];
    }

    public int coinChange(int[] coins, int amount) {
        return solvetab(coins, amount);
    }
}
