class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {

        // can't use hashset bcz => if arr and target is [1,1,1,1,1]

        int a = arr.length;
        int t = target.length;

        if(a != t) {
            return false;
        }

        Arrays.sort(arr);
        Arrays.sort(target);

        for(int i = 0; i < a; i++) {
            if(arr[i] != target[i]) {
                return false;
            }
        }

        return true;
    }
}