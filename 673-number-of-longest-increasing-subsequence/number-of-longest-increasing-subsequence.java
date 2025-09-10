class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length, max = 1, res = 0;

        // will tell the length of longest increasing subsequence starting from a given index.
        int dp[] = new int[n];
        // will tell the count of lis ending at a particular index.
        int count[] = new int[n];

        Arrays.fill(dp, 1);
        Arrays.fill(count, 1);

        for(int i = 0; i < n; i++){
            for(int prev = 0; prev < i; prev++){
                if(nums[prev] < nums[i] && dp[prev] + 1 > dp[i]){
                    dp[i] = dp[prev] + 1;
                    count[i] = count[prev];

                // It means that we have found a longest increasing subsequence and there was another one with the same length some index before, meaning we have more than one so we increase the count.
                }else if(nums[prev] < nums[i] && dp[prev] + 1 == dp[i]){
                    count[i] = count[i] + count[prev];
                }
            }

            max = Math.max(max, dp[i]);
        }

        for(int i = 0; i < n; i++){
            if(dp[i] == max) res += count[i];
        }

        return res;
    }
}