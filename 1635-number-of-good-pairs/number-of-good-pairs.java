class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int ans = 0;

        for(int i = 0; i < nums.length; i++) {
            ans += f(i, nums);
        }

        return ans;
    }

    public int f(int x, int [] nums) {

        int ans = 0;
        for(int i = x + 1; i < nums.length; i++) {
            if(nums[i] == nums[x]) ans++;
        }

        return ans;
    }
}