class Solution {
    public int minDeletionSize(String[] strs) {

        int ans = 0;

        int r = strs.length;
        int c = strs[0].length();

        // iterate column
        for(int i = 0; i < c; i++) {
            
            // iterate row
            for(int j = 0; j < r - 1; j++) {
                if(strs[j].charAt(i) - 'a' > strs[j + 1].charAt(i) - 'a') {
                    ans++;
                    break;
                }
            }

        }
        return ans;   
    }
}