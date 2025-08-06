class Solution {

    public boolean isUgly(int n) {
        if (n <= 0) return false;

        int [] prime = {2, 3, 5};

        for(int p : prime) {

            while (n % p == 0) {
                n /= p;
            }

        }

        if(n > 5) return false;
        return true;
        
    }
}
