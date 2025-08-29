class Solution {
    public long flowerGame(int n, int m) {

        long ans = 0;

        while(n > 0) {
            
            if(n % 2 == 0) {
                if(m >= 1) ans += (m + 1) / 2;
            } else {
                if(m >= 2) ans += m/2;
            }
            n--;
        }

        return ans;
    }
}