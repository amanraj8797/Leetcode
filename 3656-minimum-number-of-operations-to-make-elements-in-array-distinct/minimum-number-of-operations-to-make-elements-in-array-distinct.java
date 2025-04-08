import java.util.HashMap;
import java.util.Map;

class Solution {
    public int minimumOperations(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int lastIndex = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (countMap.getOrDefault(nums[i], 0) > 0) { 
                lastIndex = i + 1;
                break;
            }
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1); 
        }

        // Calculate the number of operations
        return (lastIndex + 2) / 3; // rounding up lastIndex / 3
    }
}
