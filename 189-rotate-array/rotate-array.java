class Solution {

    void swap(int [] nums, int i, int j) {
        
        while(i <= j) {
            int temp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = temp;
        }

    }
    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k %= n;

        if(n == 1 || k == 0) return;


        int i = 0;

        swap(nums, 0, n - 1);

        swap(nums, 0, k - 1);
        swap(nums, k, n - 1);
        
    }
}