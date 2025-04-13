class Solution {
    public int[] sortEvenOdd(int[] nums) {

        int n = nums.length;

        int [] even = new int[(n+1)/2];
        int [] odd = new int[n/2];

        int j = 0, k = 0;

        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                even[j++] = nums[i];
            }else {
                odd[k++] = nums[i];
            }
        }

        Arrays.sort(even);
        Arrays.sort(odd);

        j = 0;
        k = odd.length - 1;

        for(int i = 0; i < n; i++) {
            if(i%2 == 0) {
                nums[i] = even[j++];
            }else {
                nums[i] = odd[k--];
            }
        }

        return nums;
    }
}