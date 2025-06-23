class Solution {
    public int majorityElement(int[] nums) {

        HashMap <Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        int freq = 0, ans = 0;

        for(Map.Entry <Integer, Integer> set : hm.entrySet()) {
            if(freq < set.getValue()) {
                ans = set.getKey();
                freq = set.getValue();
            }
        }

        return ans;
        
    }
}