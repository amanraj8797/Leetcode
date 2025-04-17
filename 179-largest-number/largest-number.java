class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] mid = new String[n];

        // Convert each number to string
        for (int i = 0; i < n; i++) {
            mid[i] = String.valueOf(nums[i]);
        }

        // Manual bubble sort based on (a + b).compareTo(b + a)
        /*
        also do as:
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String ij = mid[i] + mid[j];
                String ji = mid[j] + mid[i];
                if (ij.compareTo(ji) < 0) {
                    // Swap
                    String temp = mid[i];
                    mid[i] = mid[j];
                    mid[j] = temp;
                }
            }
        }
        */

        Arrays.sort(mid, (a, b) -> (b + a).compareTo(a + b));

        // If the highest number is "0", return "0"
        if (mid[0].equals("0")) {
            return "0";
        }

        // Build the final answer
        StringBuilder ans = new StringBuilder();
        for (String s : mid) {
            ans.append(s);
        }

        return ans.toString();
    }
}
