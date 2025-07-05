class Solution {
    public int maxSubArray(int[] nums) {
        
        int max = nums[0];

        int n = nums.length;

        /*
        for(int i = 0; i < n; i++) {

            int mid = 0;

            for(int j = i; j < n; j++) {

                mid += nums[j]; 

                max = Math.max(max, mid);               
                
            }
        }
        */

        int cur = nums[0];

        for(int i = 1; i < n; i++) {

            cur = Math.max(cur + nums[i], nums[i]);

            max = Math.max(max, cur);
        }

        return max;
    }
}