class Solution {
    public int[] findEvenNumbers(int[] digits) {

        List <Integer> ans = new ArrayList<>();

        int [] freq = new int[10];

        for(int i = 0; i < digits.length; i++) {
            freq[digits[i]]++;
        }

        for(int i = 100; i < 999; i += 2) {
            int f = i / 100;
            int m = (i / 10) % 10;
            int l = (i % 10);    

            int [] mid = new int[10];

            mid[f]++;
            mid[m]++;
            mid[l]++;

            if(mid[f] <= freq[f] && mid[m] <= freq[m] && mid[l] <= freq[l]) ans.add(i);
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
        
    }
}