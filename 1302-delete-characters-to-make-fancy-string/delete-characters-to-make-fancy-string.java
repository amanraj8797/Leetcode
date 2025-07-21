class Solution {
    public String makeFancyString(String s) {

        int n = s.length();

        String ans = "";

        int count = 1;

        char curr = s.charAt(0);

        for(int i = 1; i < n; i++) {

            if(curr == s.charAt(i)) count++;
            else {

                if(count >= 2) {
                    ans = ans + curr + curr;
                }else ans += curr;

                curr = s.charAt(i);
                count = 1;
            }
        }

        if(count == 1) ans += curr;
        else {
            ans = ans + curr + curr;
        }        

        return ans;
        
    }
}