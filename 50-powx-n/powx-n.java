/*
 go to tle to know more
 */
class Solution {

    double power(double x, int n) {
        if (n == 0) return 1;

        double half = power(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public double myPow(double x, int n) {
        if (n >= 0) return power(x, n);

        // handle negative power correctly
        return 1 / power(x, -n);
    }
}
