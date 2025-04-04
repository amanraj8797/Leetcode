class Solution {
    public boolean canJump(int[] nums) {

        int n = nums.length;
        
        // person is at 0th index
        int maxReach = 0;
        
        for(int i = 0; i < n; i++) {

            // if step has been 0 then there is no forword going
            if(maxReach < i) {
                return false;
            }

            // maximum jump taken
            maxReach = Math.max(maxReach, i + nums[i]);

        }

        return true;
        
    }
}