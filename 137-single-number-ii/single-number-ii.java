class Solution {
    public int singleNumber(int[] nums) {

        int n = nums.length;

        int ans = 0;

        /*
        int i = 1;

        Arrays.sort(nums);

        while(i < n) {

            if(nums[i] != nums[i - 1]) {
                return nums[i - 1];
            }

            i += 3;
        }

        return nums[n - 1];
        */

        // Approach 2

            for(int bitIdx = 0; bitIdx <= 31; bitIdx++) {
            int count = 0;

            for(int i = 0; i < nums.length; i++) {
                if((nums[i] & (1 << bitIdx)) != 0) {             // can be anything but not zero. Then there is one at ith bit
                    count++;
                }
            }

            if(count % 3 == 1) {
                ans = ans + (1 << bitIdx);
            }
        }

        return ans;

    }
}