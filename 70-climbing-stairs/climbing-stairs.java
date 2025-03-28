class Solution {
    public int climbStairs(int n) {

        // base ans possible
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        int[] dp = new int[n + 1]; // Array to store the number of ways to climb up to each step
        // if person is on ground
        dp[0] = 1;
        // at 1st stair
        dp[1] = 1;
        // at second stair (either 1+1, 2)
        dp[2] = 2;
        
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]; 
        }
        
        return dp[n];
    }
}
