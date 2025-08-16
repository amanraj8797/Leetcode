class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {

        int n = groupSizes.length;

        HashMap <Integer, ArrayList<Integer>> hm = new HashMap<>();

        for(int i = 0; i < n; i++) {
            
            if(hm.containsKey(groupSizes[i])) {
                hm.get(groupSizes[i]).add(i);
            } else {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(i);
                hm.put(groupSizes[i], al);
            }

        }

        List<List<Integer>> ans = new ArrayList<>();

        for(Map.Entry<Integer, ArrayList<Integer>> set : hm.entrySet()) {

            ArrayList <Integer> mid = set.getValue();

            int p = 0;

            while(p < mid.size()) {

                ArrayList <Integer> store = new ArrayList<>();

                for(int i = 0; i < set.getKey(); i++) {
                    store.add(mid.get(p));
                    p++;
                }

                ans.add(store);
            }
        }

        return ans;
        
    }
}