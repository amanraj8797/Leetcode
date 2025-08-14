class Solution {
    public String largestGoodInteger(String num) {

        int n = num.length();

        char ch = '0';

        StringBuilder ans = new StringBuilder();

        for(int i = 0; i <= n - 3; i++) {

            if(num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)) {
                if(ch <= num.charAt(i + 1)) {
                    ans = new StringBuilder();
                    ch = num.charAt(i);
                    ans.append(num.charAt(i)).append(num.charAt(i)).append(num.charAt(i));
                }
                i += 2;
            }
        }

        return ans.toString();
        
    }
}