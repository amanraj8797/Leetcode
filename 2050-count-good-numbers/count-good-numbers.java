class Solution {

    private static final int max = 1_000_000_007;

    public int countGoodNumbers(long n) {

        long e = (n+1)/2;
        long o = n/2;

        long eways = modProb(5, e);
        long oways = modProb(4, o);

        return (int)((eways*oways)%max);
    }

    private long modProb(long base, long exp) {

        long result = 1;

        base %= max;

        while(exp > 0) {
            if((exp & 1) == 1) {
                result = (result * base) % max;
            }
            base = (base*base) % max;
            exp >>= 1; 
        }

        return result;

    }
}