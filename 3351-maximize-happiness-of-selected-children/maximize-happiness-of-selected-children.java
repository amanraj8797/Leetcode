class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {

        Arrays.sort(happiness);

        long ans = 0;

        int x = 0;

        for(int i = happiness.length - 1; i >= happiness.length - k; i--) {

            if((happiness[i] - x) < 0) break;

            ans += happiness[i];
            ans -= x;
            x++;

        }

        return ans;
        
    }
}