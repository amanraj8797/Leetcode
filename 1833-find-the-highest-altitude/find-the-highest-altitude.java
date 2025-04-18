class Solution {
    public int largestAltitude(int[] gain) {

        int [] sumArr = new int[gain.length + 1];

        for(int i = 1; i <= gain.length; i++) {
            sumArr[i] = sumArr[i - 1] + gain[i - 1];
        }

        int max = sumArr[0];

        for(int i = 1; i < sumArr.length; i++) {
            if(sumArr[i] > max) max = sumArr[i];
        }
        
        return max;
    }
}