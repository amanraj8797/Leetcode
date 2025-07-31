class Solution {
    public boolean canConstruct(String s, int k) {

        int [] freq = new int[26];

        int n = s.length();

        if(n < k) return false;

        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            freq[ch - 'a'] += 1;

        }

        int odd = 0;

        for(int i = 0; i < 26; i++) {
            if(freq[i] % 2 != 0) odd++;
        }   

        if(odd > k) return false;    

        return true;
        
    }
}