// class Solution {
//     public int minimumLines(int[][] stockPrices) {

//         int n = stockPrices.length;

//         if(n == 1) return 0;

//         Arrays.sort(stockPrices, (x, y) -> Integer.compare(x[0],y[0]));  

//         double m1 = ((double)(stockPrices[1][1] - stockPrices[0][1]))/(stockPrices[1][0] - stockPrices[0][0]);

//         int ans = 1;

//         for(int i = 2; i < n; i++) {

//             double m2 = ((double)(stockPrices[i][1] - stockPrices[i - 1][1]))/(stockPrices[i][0] - stockPrices[i - 1][0]);

//             if(m1 != m2) {

//                 m1 = m2;
//                 ans++;

//             }
//         }

//         return ans;
        
//     }
// }

// ============== floating point precision issue

class Solution {
    public int minimumLines(int[][] stockPrices) {

        int n = stockPrices.length;

        if(n == 1) return 0;

        Arrays.sort(stockPrices, (x, y) -> Integer.compare(x[0],y[0]));  

        long prevDy = (long)(stockPrices[1][1] - stockPrices[0][1]);
        long prevDx = (long)(stockPrices[1][0] - stockPrices[0][0]);

        int ans = 1;

        for(int i = 2; i < n; i++) {

            long dy = (long)(stockPrices[i][1] - stockPrices[i - 1][1]);
            long dx = (long)(stockPrices[i][0] - stockPrices[i - 1][0]);

            if(prevDy*dx != prevDx*dy) {

                prevDy = dy;
                prevDx = dx;
                ans++;

            }
        }

        return ans;
        
    }
}