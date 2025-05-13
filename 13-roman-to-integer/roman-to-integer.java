class Solution {
    public int romanToInt(String s) {

        HashMap <Character, Integer> store =  new HashMap<>();
        
        store.put('I', 1);
        store.put('V', 5);
        store.put('X', 10);
        store.put('L', 50);
        store.put('C', 100);
        store.put('D', 500);
        store.put('M', 1000);

        int n = s.length();

        int ans = store.get(s.charAt(n - 1));

        for(int i = n - 2; i >= 0; i--) {
            char ch = s.charAt(i);
            char chl = s.charAt(i + 1);

            if(store.get(ch) >= store.get(chl)) ans += store.get(ch);
            else ans -= store.get(ch);

        }

        return ans;
    }
}