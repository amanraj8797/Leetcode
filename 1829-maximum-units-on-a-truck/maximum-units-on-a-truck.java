class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        int n = boxTypes.length;

        int ans = 0;

        Arrays.sort(boxTypes, Comparator.comparingDouble(o -> o[1]));

        for(int i = n - 1; i >= 0; i--) {
            if(truckSize >= boxTypes[i][0]) {
                ans = ans + boxTypes[i][0]*boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            }else {
                ans = ans + boxTypes[i][1]*truckSize;
                break;
            }
        }
        return ans;
        
    }
}