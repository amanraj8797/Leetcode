class Solution {
    public int minSwaps(String s) {

        int n = s.length();

        int ans = 0;

        Stack <Character> st = new Stack<>();

        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if(ch == ']') {

                if(st.empty()) {
                    ans++;
                    st.push('[');
                }else {
                    st.pop();
                }
            }else {
                st.push(ch);
            }
        }

        return ans;
        
    }
}