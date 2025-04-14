class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {

        // can't use hashset bcz => if arr and target is [1,1,1,1,1]

        int a = arr.length;
        int t = target.length;

        if(a != t) {
            return false;
        }
// Method 1
        // Arrays.sort(arr);
        // Arrays.sort(target);

        // for(int i = 0; i < a; i++) {
        //     if(arr[i] != target[i]) {
        //         return false;
        //     }
        // }

        // return true;


// Method 2
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int num: arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for(int num : target) {
            if(hm.containsKey(num)) {
                hm.put(num, hm.get(num) - 1);
            }else {
                return false;
            }

            if(hm.get(num) == 0) {
                hm.remove(num);
            }
        }

        return hm.isEmpty();
    }
}