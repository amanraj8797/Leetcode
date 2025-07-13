class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;

        int ele = nums[0];

        int j = 1, k = 1;

        for( ; k < n; ) {

            if(ele != nums[k]) {
                ele = nums[k];
                nums[j] = ele;
                j++;
            }
            k++;
        }

        return j;
        
    }
}