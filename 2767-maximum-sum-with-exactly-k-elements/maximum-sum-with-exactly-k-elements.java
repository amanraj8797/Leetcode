class Solution {
    public int maximizeSum(int[] nums, int k) {

        int max = -1;

        for(int i = 0; i < nums.length; i++) {
            
            if(nums[i] > max) max = nums[i];

        }

        int ans = 0;

        while(k != 0) {

            ans += max;
            max++;
            k--;

        }

        return ans;
        
    }
}