class Solution {
    public String convertDateToBinary(String date) {

        String [] dateArr = date.split("-");

        int year = Integer.parseInt(dateArr[0]);
        int month = Integer.parseInt(dateArr[1]);
        int ddate = Integer.parseInt(dateArr[2]);

        ArrayList <Integer> binary = new ArrayList<>();

        while(year != 0) {
            binary.add(year % 2);
            year /= 2;
        }

        String ans = "";

        for(int i = binary.size() - 1; i >= 0; i--) {
            ans += binary.get(i);
        }

        ans += "-";

        binary.clear();

        while(month != 0) {
            binary.add(month % 2);
            month /= 2;
        }

        for(int i = binary.size() - 1; i >= 0; i--) {
            ans += binary.get(i);
        }

        binary.clear();

        while(ddate != 0) {
            binary.add(ddate % 2);
            ddate /= 2; 
        }

        ans += "-";

        for(int i = binary.size() - 1; i >= 0; i--) {
            ans += binary.get(i);
        }

        return ans;
        
    }
}