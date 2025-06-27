class Solution {
    public int countPrimes(int n) {

        /* Sieve of sundaram or sieve of e

        m = (n - 1)/2;

        i = j = 1;
        z = i + j + 2*i*j;        // index value

        break => (i == j && z > m) 


        for prime number except 2
        => 2*arr[i] + 1

        */

        if(n <= 2) return 0;

        int m = (n - 2)/2;      // exclude n

        int [] arr = new int[m];

        int i = 0;

        for( ; i < m; i++) {
            arr[i] = i + 1;
        }

        i = 1;

        int j = i;

        int z ;

        while(true){

         z = i + j + 2*i*j;
            if(i == j && z > m) break;

            if(z <= m) {
               
                arr[z - 1] = -1;
                j++;
            }else {
                i++;
                j = i;
            }
        }

        int count = 1;

        for(i = 0; i < m; i++) {
            if(arr[i] != -1) count++;
        }

        return count;

        
    }
}