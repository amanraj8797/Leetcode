public class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x > y) {
            return removeSubstring(s, "ab", x, y);
        } else {
            return removeSubstring(s, "ba", y, x);
        }
    }

    private int removeSubstring(String s, String first, int firstScore, int secondScore) {
        // First pass: remove all instances of 'first' (higher score)
        StringBuilder sb = new StringBuilder();
        int score = 0;
        for (char c : s.toCharArray()) {
            int len = sb.length();
            if (len > 0 && sb.charAt(len - 1) == first.charAt(0) && c == first.charAt(1)) {
                sb.deleteCharAt(len - 1);
                score += firstScore;
            } else {
                sb.append(c);
            }
        }

        // Second pass: remove all instances of the second substring (lower score)
        StringBuilder finalSb = new StringBuilder();
        for (char c : sb.toString().toCharArray()) {
            int len = finalSb.length();
            if (len > 0 && finalSb.charAt(len - 1) == first.charAt(1) && c == first.charAt(0)) {
                finalSb.deleteCharAt(len - 1);
                score += secondScore;
            } else {
                finalSb.append(c);
            }
        }

        return score;
    }
}
