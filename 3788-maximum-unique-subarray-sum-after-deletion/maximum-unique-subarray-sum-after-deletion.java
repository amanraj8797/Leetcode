// class Solution {
//     public int maxSum(int[] nums) {
        
//         HashSet <Integer> hs = new HashSet<>();

//         int n = nums.length;

//         int ans = 0, curr = 0;

//         for(int i = 0; i < n; i++) {

//             if(!hs.contains(nums[i])) {
//                 curr = ans + nums[i];
//                 ans = Math.max(ans, curr);
//             } else {
//                 hs.clear();
//                 curr = 0;
//             }
//             hs.add(nums[i]);
//         }

//         return ans;
//     }
// }

class Solution {
  public int maxSum(int[] nums) {
    final int mx = Arrays.stream(nums).max().getAsInt();
    if (mx <= 0)
      return mx;
    return Arrays.stream(nums)
        .boxed()
        .collect(Collectors.toSet())
        .stream()
        .filter(num -> num > 0)
        .mapToInt(Integer::intValue)
        .sum();
  }
}
