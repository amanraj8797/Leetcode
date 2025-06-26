class Solution {

    void solve(int n, int a, int b, StringBuilder comb, List<String> ans) {
        if (a == n && b == n) {
            ans.add(comb.toString());
            return;
        }

        if (a < n) {
            comb.append('(');
            solve(n, a + 1, b, comb, ans);
            comb.deleteCharAt(comb.length() - 1);  // backtrack
        }

        if (a > b) {
            comb.append(')');
            solve(n, a, b + 1, comb, ans);
            comb.deleteCharAt(comb.length() - 1);  // backtrack
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder comb = new StringBuilder();
        solve(n, 0, 0, comb, ans);
        return ans;
    }
}
