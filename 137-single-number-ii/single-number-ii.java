class Solution {
    public int singleNumber(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        int ans = 0;

        int i = 1;

        while(i < n) {

            if(nums[i] != nums[i - 1]) {
                return nums[i - 1];
            }

            i += 3;
        }

        if(ans == 0) {
            ans = nums[n - 1];
        }

        return ans;
        
    }
}