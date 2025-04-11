class Solution {

    int isSymmetry(int num) {

        String s = Integer.toString(num);

        int n = s.length();

        if(n % 2 != 0) {
            return 0;
        }

        int x = 0, y = 0;

        for(int i = 0; i < n/2; i++) {
            x += s.charAt(i) - '0';
        }

        for(int i = n/2; i < n; i++) {
            y += s.charAt(i) - '0';
        }

        if(x == y) {
            return 1;
        }else {
            return 0;
        }

    }
    public int countSymmetricIntegers(int low, int high) {

        int count = 0;

        for(int i = low; i <= high; i++) {
            count += isSymmetry(i);
        }

        return count;
        
    }
}