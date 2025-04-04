class Solution {
    public int minStoneSum(int[] piles, int k) {

        int n = piles.length;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i = 0; i < n; i++) {
            maxHeap.add(piles[i]);
        }


        for(int i = 0; i < k; i++) {
            maxHeap.add((int)Math.ceil(maxHeap.poll()/2.0));
        }

        int ans = 0;

        for(int i = 0; i < n; i++) {

            ans += maxHeap.poll();

        }

        return ans;
        
    }
}