class Solution {
    public List<String> removeSubfolders(String[] folder) {

        Arrays.sort(folder);

        HashMap <Integer, String> hm = new HashMap<>();
        int c = 0;

        List <String> ans = new ArrayList<>();

        for(int i = 0; i < folder.length; i++) {

            int check = -1;

            for(int j = 0; j < hm.size(); j++) {
                check = folder[i].indexOf(hm.get(j));

                if(check == 0) break;
            }

            if(check != 0) {
                hm.put(c++, folder[i]+"/");
                ans.add(folder[i]);
            }
        }

        return ans;
        
    }
}