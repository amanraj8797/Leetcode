class Solution {
    public int minimumLength(String s) {

        StringBuilder str = new StringBuilder(s);

        HashMap <Character, Integer> hm = new HashMap<>();

        int n = str.length();

        for(int i = 0; i < n; i++) {

            hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
        } 

        int ans = 0;

        for(Map.Entry <Character, Integer> set : hm.entrySet()) {

            int x = set.getValue();

            while(x >= 3) {
                x -= 2;
            }

            ans += x;
        }


        return ans;        
    }
}