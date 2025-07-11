class Solution {

    int [] nextSmallerRight(int [] arr, int n) {

        int [] ans = new int[n];

        Stack <Integer> st = new Stack<>();

        for(int i = n - 1; i >= 0; i--) {
            while(!st.empty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if(st.empty()) ans[i] = n;
            else {
                ans[i] = st.peek();
            }

            st.push(i);
        }

        return ans;
    }

    int [] nextSmallerLeft(int [] arr, int n) {

        int [] ans = new int[n];

        Stack <Integer> st = new Stack<>();

        for(int i = 0; i < n; i++) {
            while(!st.empty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if(st.empty()) ans[i] = -1;
            else {
                ans[i] = st.peek();
            }

            st.push(i);
        }

        return ans;
    }

    public int largestRectangleArea(int[] heights) {

        int n = heights.length;

        int [] ngr = nextSmallerRight(heights, n);
        int [] ngl = nextSmallerLeft(heights, n);

        int ans = 0;

        for(int i = 0; i < n; i++) {
            
            ans = Math.max(ans, (ngr[i] - ngl[i] - 1)*heights[i]);

        }

        return ans;

    }
}