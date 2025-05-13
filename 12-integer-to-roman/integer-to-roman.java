class Solution {
    public String intToRoman(int num) {

        int [] intCode = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String [] romanCode = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        String ans = "";

        for(int i = intCode.length - 1; i >= 0; i--) {

            while(num >= intCode[i]) {
                ans += romanCode[i];
                num -= intCode[i];
            }

        }

        return ans;
        
    }
}