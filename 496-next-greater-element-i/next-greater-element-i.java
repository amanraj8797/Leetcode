class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n = nums1.length;

        HashMap<Integer, Integer> hm = new HashMap<>();

        Stack <Integer> st = new Stack<>();

        for(int i = nums2.length - 1; i >= 0; i--) {
            while(!st.empty() && st.peek() <= nums2[i]) {
                st.pop();
            }

            if(st.empty()) hm.put(nums2[i], -1);
            else hm.put(nums2[i], st.peek());

            st.push(nums2[i]);
        }

        int [] ans = new int[n];

        for(int i = 0; i < n; i++) {
            ans[i] = hm.get(nums1[i]);
        }

        return ans;

        
        
    }
}