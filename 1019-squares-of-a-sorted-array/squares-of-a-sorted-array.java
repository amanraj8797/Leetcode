class Solution {
    public int[] sortedSquares(int[] nums) {

        int [] ans = new int[nums.length];

        int i = 0, j = nums.length - 1, k = nums.length - 1;

        while(i <= j) {
            int p = nums[i] * nums[i];
            int q = nums[j] * nums[j];
            if(p > q) {
                ans[k--] = p;
                i++;
            }else {
                ans[k--] = q;
                j--;
            }
        }

        return ans;
        
    }
}