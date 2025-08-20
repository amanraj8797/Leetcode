class Solution {
    public boolean canJump(int[] nums) {

        int n = nums.length;

        if(n == 1) return true;

        int [] dp = new int[n];

        if(nums[0] > 0) dp[0] = 1;

        int i = 0;

        while(dp[i] != 0) {

            if(nums[i] + i >= (n - 1)) {
                return true;
            }

            int j = i;

            while(j <= (i + nums[i])) {
                dp[j] = 1;
                j++;
            }
            i++;
        }

        return false;
        
    }
}