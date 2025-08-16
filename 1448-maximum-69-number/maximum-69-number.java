class Solution {
    public int maximum69Number (int num) {

        String str = Integer.toString(num);         // String.valueOf(num)  or  num + ""

        num *= 0; 

        boolean flag = false;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '6' && flag == false) {
                num = num * 10 + 9;
                flag = true;
            } else {
                num = num * 10 + (str.charAt(i) - '0');
            }
        }

        return num;

    }
}