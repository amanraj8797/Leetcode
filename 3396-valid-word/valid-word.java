class Solution {
    public boolean isValid(String word) {

        int n = word.length();

        if(n < 3) return false;

        int vowel = 0;
        int con = 0;

     for(int i = 0; i < n; i++) {
        char ch = Character.toLowerCase(word.charAt(i));

        if((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z')) {

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vowel++;
            else if(ch >= 'b' && ch <= 'z') con++;

        }else return false;
     }   

     if(vowel >= 1 && con >= 1) return true;

     return false;

    }
}