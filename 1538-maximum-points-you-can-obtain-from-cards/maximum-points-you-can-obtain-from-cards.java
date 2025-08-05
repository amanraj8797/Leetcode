class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;

        int l = 0, r = n - 1, len = 0, score = 0, sum = 0;

        while(l < k) {

            sum += cardPoints[l++];

            score = Math.max(score, sum);           

        }

        sum -= cardPoints[--l];

        while(r >= (n - k)) {
            sum += cardPoints[r--];
            score = Math.max(score, sum);
            if(l > 0) sum -= cardPoints[--l];
        }

        return score;
        
    }
}