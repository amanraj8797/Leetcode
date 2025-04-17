class Solution {
    public int longestPalindrome(String s) {

        int n = s.length();

        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i = 0; i < n; i++) {

            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);

        }

        boolean hasOdd = false;

        int ans = 0;

        /*
         hm.keySet() = > for keys
        */

        for (Map.Entry<Character, Integer> set : hm.entrySet()) {   //  for (int count : hm.values())

            int x = set.getValue();

            if(x % 2 == 0) {
                ans += x;
            }else {
                ans = ans + x - 1;
                hasOdd = true;
            }
        }

        return hasOdd == true ? ans + 1 : ans;        
    }
}