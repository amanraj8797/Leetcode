class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;

        // Counting how many times each answer appears
        for (int i = 0; i < answers.length; i++) {
            hm.put(answers[i], hm.getOrDefault(answers[i], 0) + 1);
        }

        // Calculate the minimum number of rabbits based on the answers
        for (Map.Entry<Integer, Integer> map : hm.entrySet()) {
            int answer = map.getKey();  // how many other rabbits have the same color
            int count = map.getValue(); // how many rabbits gave that answer

            if (answer == 0) {
                ans += count; // All rabbits with answer 0 are distinct.
            } else {
                // Calculate the minimum number of rabbits needed for this group
                ans += ((count + answer) / (answer + 1)) * (answer + 1);
            }
        }

        return ans;
    }
}
