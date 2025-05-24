class Solution {
    public int[] runningSum(int[] nums) {

        int [] ans = new int[nums.length];

        int mid = 0;        

        for(int i = 0; i < nums.length; i++) {

            mid += nums[i]; 

            ans[i] = mid;                       
        }
        
        return ans;
    }
}