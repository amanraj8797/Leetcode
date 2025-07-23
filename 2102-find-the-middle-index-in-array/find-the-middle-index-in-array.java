class Solution {
    public int findMiddleIndex(int[] nums) {

        int totalSum = 0;

        for(int x : nums) {
            totalSum += x;
        }

        float sum = 0;

        for(int i = 0; i < nums.length; i++) {

            if(sum == (float)(totalSum - nums[i])/2) return i;
            sum += nums[i];

        }

        return -1;
        
    }
}