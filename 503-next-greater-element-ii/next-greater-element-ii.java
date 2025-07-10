class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;

        int [] ans = new int[n];

        Stack <Integer> st = new Stack<>();

        for(int i = n - 1; i >= 0; i--) {

            while(!st.empty() && st.peek() <= nums[i]) {
                st.pop();
            }

            if(st.empty()) ans[i] = -1;
            else ans[i] = st.peek();

            st.push(nums[i]);
        }

        for(int i = n - 1; i >= 0; i--) {

            while(!st.empty() && st.peek() <= nums[i]) {
                st.pop();
            }

            if(st.empty()) ans[i] = -1;
            else ans[i] = st.peek();

            st.push(nums[i]);
        }

        return ans;
        
    }
}