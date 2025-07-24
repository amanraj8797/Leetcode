class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int n = nums.length;
        int [] ans = nums.clone();

        HashMap <Integer, Integer> hm = new HashMap<>();

        Arrays.sort(ans);

        for(int i = 0; i < n; i++) {
            if(!hm.containsKey(ans[i])) {
                hm.put(ans[i], i);
            }
        }

        for(int i = 0; i < n; i++) {
            ans[i] = hm.get(nums[i]);
        }        

        return ans;
        
    }
}