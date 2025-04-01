class Solution {
    public int minOperations(int[] nums) {

        int x = nums.length;

        int ans = 0;

        if(x <=1) {
            return ans;
        }

        int prev = nums[0];

        for(int i = 1; i < x; i++) {

            if(nums[i] <= prev) {
                ans = ans + prev - nums[i] + 1;
                prev += 1;              
            }else {
                prev = nums[i];
            }

        }

        return ans;
        
    }
}