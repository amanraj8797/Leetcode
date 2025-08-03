class Solution {
    public int reverse(int x) {

        int ans = 0;

        while(x != 0) {

            int r = x % 10;

            // Check for overflow before it happens
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && r > 7)) {
                return 0; // overflow
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && r < -8)) {
                return 0; // underflow
            }

            ans = ans*10 + r;

            x /= 10;
        }

        return ans;
        
    }
}