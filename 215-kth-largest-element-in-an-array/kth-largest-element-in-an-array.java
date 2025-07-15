class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> mid = new PriorityQueue<Integer>();

        for(int i = 0; i < nums.length; i++) {

            mid.add(nums[i]);

            if(mid.size() > k) {
                mid.poll();
            }
        }

        int ans = mid.peek();

        return ans;
        
    }
}