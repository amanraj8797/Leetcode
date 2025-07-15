class Solution {
    public int[] twoSum(int[] nums, int t) {

        int [] ans = new int[2];
        
        HashMap <Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            if(hm.containsKey(t - nums[i])) {
                ans[0] = hm.get(t - nums[i]);
                ans[1] = i;
            }

            hm.put(nums[i], i);
        }

        return ans;

    }
}