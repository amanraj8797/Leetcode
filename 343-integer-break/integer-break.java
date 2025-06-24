class Solution {
    public int integerBreak(int n) {

        /* There is a pattern like

        n = 2 => 1;   // bases condition
        n = 3 => 2;

        n = 4 => 2*2;
        n = 5 => 3*2;
        n = 6 => 3*3;
        n = 7 => 3*4;
        n = 8 => 3*3*2;
        n = 9 => 3*3*3;
        n = 10 => 3*3*4; .... similarly it goes on


        */

        if(n == 2) return 1;
        else if(n == 3) return 2;

        int last = 0;

        if(n % 3 == 1) last = 4;
        else if(n % 3 == 2) last = 2;
        else if(n % 3 == 0) last = 3;

        return (int)Math.pow(3, (n-2)/3) * last;


    }
}