class Solution {
    public int[] singleNumber(int[] nums) {

        int n = nums.length;

        if(n <= 3) return nums;

        int [] ans = new int[2];

        Arrays.sort(nums);

        int c = 0;

        for(int i = 1; i < n; i += 2) {

            if(nums[i] != nums[i - 1]) {

                ans[c++] = nums[i - 1];

                if(i < n - 1 && nums[i] != nums[i + 1]) {
                    ans[c++] = nums[i];
                }

                if(c == 2) return ans;
                i++;
            }

        }

        if(c == 1) {
            ans[c] = nums[n - 1];
        }

        return ans;


    }
}