class Solution {

    boolean check(int m, int n) {
        return (long)m*m <= n;
    }
    public int mySqrt(int x) {

        if(x == 1) return x;

        int low = 1;
        int high = x, ans = 0;

        while(low <= high) {
            int mid = low + (high - low)/2;

            if(check(mid, x)) {
                ans = mid;
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }

        return ans;
        
    }
}