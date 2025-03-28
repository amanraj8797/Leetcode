/*
class Solution {
    public int maxSubArray(int[] nums) {

        Arrays.sort(nums);

        int ans = 0, x = 0;

        HashSet<Integer> hs = new HashSet<>();

        for(int i : nums) {
            hs.add(i);
        }

        for (int i : hs) {
            if(i > 0) {
                ans += 0;
            } else {
                x = i;
            }            
        }    

        ans += x;

        return ans;   
         
    }
}
*/

/*
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int res = nums[0];
        int lastOne = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            lastOne = Math.max(nums[i], lastOne + nums[i]);
            res = Math.max(res, lastOne);
        }

        return res;
    }
}
*/

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int n = nums.length;
        int[] dp = new int[n]; // DP array to store the maximum sum ending at each index
        
        dp[0] = nums[0];
        
        int res = dp[0];
        
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            res = Math.max(res, dp[i]); 
        }
        
        return res; 
    }
}

