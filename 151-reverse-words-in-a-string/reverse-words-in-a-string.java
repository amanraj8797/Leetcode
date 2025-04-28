class Solution {
    public String reverseWords(String s) {

        String regrex = "\\s+";

        String [] mid = s.trim().split(regrex);

        String ans = "";

        for(int i = mid.length - 1; i >= 0; i--) {
            ans += mid[i];

            if(i > 0) ans += " ";
        }

        return ans;
        
    }
}