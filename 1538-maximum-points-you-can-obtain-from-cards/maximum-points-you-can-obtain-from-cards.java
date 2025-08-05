class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;

        int leftSum = 0, l = 0;

        int rightSum = 0, r = n - 1;

        int score = 0;

        while(l < k) {
            leftSum += cardPoints[l++];
        }

        score = Math.max(score, leftSum + rightSum);

        l--;

        while(r >= n - k) {
            rightSum += cardPoints[r--];
            leftSum -= cardPoints[l--];

            score = Math.max(score, leftSum + rightSum);
        }
        
        return score;
    }
}