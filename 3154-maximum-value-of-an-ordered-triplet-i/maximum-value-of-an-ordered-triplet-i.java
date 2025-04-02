// class Solution {
//     public long maximumTripletValue(int[] nums) {

//         long max = 0;

//         int n = nums.length;

//         for(int j = 1; j < n - 1; j++) {

//             int maxI = Integer.MIN_VALUE;

//             for(int i = 0; i < j; i++) {
//                 maxI = Math.max(maxI, nums[i]);
//             }

//             int maxK = Integer.MIN_VALUE;

//             for(int k = j + 1; k < n; k++) {
//                 maxK = Math.max(maxK, nums[k]);
//             }

//             long cmax = (long)(maxI - nums[j])*maxK;

//             max = Math.max(cmax, max);
            
//         }

//         System.out.println(max);
        

//         return max;
        
//     }
// }


class Solution {
    public long maximumTripletValue(int[] nums) {

        long max = 0;

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {

                    long cmax = (long)(nums[i] - nums[j])*nums[k];

                    if(cmax > max) {

                        max = cmax;

                    }

                }
            }
        }

        System.out.println(max);
        

        return max;
        
    }
}