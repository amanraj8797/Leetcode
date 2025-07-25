class Solution {
    public String maximumOddBinaryNumber(String s) {

        int count1 = 0;

        int n = s.length();

        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == '1') count1++;
        }

        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < n - 1; i++) {

            if(count1-- > 1) ans.append('1');
            else ans.append('0');
        }

        ans.append('1');

        return ans.toString();
        
    }
}