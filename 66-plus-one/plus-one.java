class Solution {
    public int[] plusOne(int[] digits) {

        int n = digits.length;

        int c = 1;

        for(int i = n - 1; i >= 0; i--) {
            int mid = digits[i] + c;

            if(mid > 9) {
                digits[i] = 0;
                c = 1;
            }else {
                digits[i] = mid;
                return digits;
            }
        }

        int [] ans = new int[digits.length + 1];

        ans[0] = 1;

        return ans;
        
    }
}