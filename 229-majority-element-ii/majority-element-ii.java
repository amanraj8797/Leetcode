class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap <Integer, Integer> hm = new HashMap<>();

        int n = nums.length;

        for(int i = 0; i < n; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        ArrayList <Integer> ans = new ArrayList<>();

        for(Map.Entry<Integer, Integer> set : hm.entrySet()) {
            int freq = set.getValue();

            if(freq > n/3) ans.add(set.getKey());
        }

        return ans;
        
    }
}