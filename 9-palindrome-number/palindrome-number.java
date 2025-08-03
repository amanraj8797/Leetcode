class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0) return false; // Negative numbers are not palindromes by definition

        String numStr = String.valueOf(x);
        String reversed = new StringBuilder(numStr).reverse().toString();

        return numStr.equals(reversed);
    }
}
// 