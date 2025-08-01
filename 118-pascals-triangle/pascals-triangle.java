class Solution {
    public List<List<Integer>> generate(int n) {

        List <List<Integer>> ans = new ArrayList<>();

        List <Integer> store = new ArrayList<>();

        for(int i = 0; i < n; i++) {

            int k = 0;

            List <Integer> mid = new ArrayList<>();

            for(int j = 0; j <= i; j++) {

                if(j == 0 || j == i) {
                    mid.add(1);
                }
                else {
                    mid.add(store.get(k) + store.get(k + 1));
                    k++;
                }
            }

            store = mid;
            ans.add(mid);
        }

        return ans;
        
    }
}