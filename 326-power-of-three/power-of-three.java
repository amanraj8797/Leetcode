class Solution {
    public boolean isPowerOfThree(int n) {

        if(n <= 0) return false;

        if(n == 1) return true;

        int r = n % 3;

        n /= 3;

        while(r == 0 && n > 1) {
            r = n % 3;
            n /= 3;
        }

        if(n == 1 && r == 0) return true;

        return false;
        
    }
}