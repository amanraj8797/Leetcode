class Solution {
    public char kthCharacter(int k) {

        StringBuilder str = new StringBuilder("a");

        while(str.length() < k) {
            int size = str.length();

            for(int i = 0; i < size; i++) {
                str.append((char)('a' + ((str.charAt(i) - 'a') + 1) % 26));
            }
        }

        return str.charAt(k - 1);
        
    }
}