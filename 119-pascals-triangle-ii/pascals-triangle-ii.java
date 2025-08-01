class Solution {
    public List<Integer> getRow(int n) {

        ArrayList <Integer> ans = new ArrayList<>();

        for(int i = 0; i <= n; i++) {

            int k = 0;

            ArrayList <Integer> mid = new ArrayList<>();

            for(int j = 0; j <= i; j++) {

                if(j == 0 || j == i) mid.add(1);
                else {
                    mid.add(ans.get(k) + ans.get(k + 1));
                    k++;
                }
            }
            ans = mid;
        } 

        return ans;
        
    }
}