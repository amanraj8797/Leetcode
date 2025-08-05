class Solution {

    void seive(int [] prime) {

        Arrays.fill(prime, 1);

        int n = prime.length;

        for(int i = 2; i*i < n; i++) {

            if(prime[i] == 1)
                for(int j = i * i; j < n; j += i) {
                
                    if(prime[j] == 1) prime[j] = 0;
    
                }
        }
    }
    public int countPrimes(int n) {

        // sieve of eroctoses


        if(n <= 2) return 0;

        int count = 0;

        int [] prime = new int[n];

        seive(prime);

        for(int i = 2; i < n; i++) {
            if(prime[i] == 1) count++;
        }
        

        return count;
    }
}

/* Sieve of sundaram or sieve of e

        m = (n - 1)/2;

        i = j = 1;
        z = i + j + 2*i*j;        // index value

        break => (i == j && z > m) 


        for prime number except 2
        => 2*arr[i] + 1

        */

        /*
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
        */