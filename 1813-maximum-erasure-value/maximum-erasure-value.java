// =========== brut force
// class Solution {
//     public int maximumUniqueSubarray(int[] nums) {
        
//         HashMap<Integer, Integer> hm = new HashMap<>();

//         int ans = 0, curr = 0;

//         for(int i = 0; i < nums.length; i++) {
//             if(hm.containsKey(nums[i])) {
//                 int x = hm.get(nums[i]);
//                 ans = Math.max(curr, ans);
//                 curr = 0;
//                 hm.clear();
//                 i = x;
//             }else {
//                 hm.put(nums[i], i);
//                 curr += nums[i];
//             }

//             ans = Math.max(curr, ans);
//         }

//         return ans;
//     }
// }

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();

        int n = nums.length;

        int left = 0, right = 0, ans = 0, curr = 0;

        while(right < n) {

            if(!hs.contains(nums[right])) {
                hs.add(nums[right]);
                curr += nums[right];
                ans = Math.max(curr, ans);
                right++;
            } else {
                curr -= nums[left];
                hs.remove(nums[left]);
                left++;
            }
            
        }

        ans = Math.max(curr, ans);

        return ans;
    }
}