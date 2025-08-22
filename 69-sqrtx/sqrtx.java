class Solution {

    public int mySqrt(int x) {

        if(x <= 1) return x;

        int ans = 2*mySqrt(x/4);

        if((long)(ans + 1)*(ans + 1) <= x) return (ans + 1);

        return ans;
        
    }
}