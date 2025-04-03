class Solution {

    public long maximumTripletValue(int[] nums) {
        long currentMax = 0;
        long maximumDiff = 0;
        long answer = 0;

        for (int num : nums) {
            answer = Math.max(answer, num * maximumDiff);
            currentMax = Math.max(currentMax, num);
            maximumDiff = Math.max(maximumDiff, currentMax - num);
        }

        return answer;
    } 
}