class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {

        int n = hand.length;

        if (n % groupSize != 0) return false;

        TreeMap<Integer, Integer> hm = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            hm.put(hand[i], hm.getOrDefault(hand[i], 0) + 1);
        }

        while (hm.size() > 0) {

            int start = hm.firstKey();

            for (int i = 0; i < groupSize; i++) {
                int current = start + i;

                if (!hm.containsKey(current)) return false;

                int count = hm.get(current);
                if (count == 1) {
                    hm.remove(current);
                } else {
                    hm.put(current, count - 1);
                }
            }
        }

        return true;
    }
}
