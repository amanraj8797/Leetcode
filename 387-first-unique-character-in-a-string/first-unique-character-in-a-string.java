class Solution {
    public int firstUniqChar(String s) {

        if(s.length() == 1) return 0;

        HashMap <Character, Integer> hm = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {

            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);

        }

        char ans;

        for(int i = 0; i < s.length(); i++) {

            if(hm.get(s.charAt(i)) == 1) {
                return s.indexOf(s.charAt(i));
            }

        }


        return -1;
        
    }
}