class Solution {
    public long zeroFilledSubarray(int[] nums) {

        long count = 0;

        long ans = 0;

        for(int x: nums) {
            if(x != 0 && count > 0) {
                ans += count*(count + 1)/2;
                count = 0;
            } else if(x == 0) count++;
        }

        if(count > 0) {
            ans += count*(count + 1)/2;
        }

        return ans;

    }
}