class Solution {
    public int divide(int dividend, int divisor) {

    if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
    if (dividend == Integer.MIN_VALUE && divisor == 1) return Integer.MIN_VALUE;

    int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

    if(dividend == divisor) return 1;

    long ldividend = Math.abs((long)dividend);
    long ldivisor = Math.abs((long)divisor);

    int ans = 0;

    while(ldividend >= ldivisor) {

        int c = 0;

        while(ldividend >= (ldivisor << c)) {
            c++;
        }

        ans += (1 << (c - 1));

        ldividend -= (ldivisor << (c - 1));
    }

    return ans*sign;
        
    }
}