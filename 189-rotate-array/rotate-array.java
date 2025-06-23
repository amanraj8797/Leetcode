class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k %= n;

        if(n == 1 || k == 0) return;

        int i = 0;
        int j = n - 1;

        while(i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        } 

        i = 0;
        j = k - 1;

        while(i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;            

            i++;
            j--;
        }

        i = k;
        j = n - 1;

        while(i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
        
    }
}