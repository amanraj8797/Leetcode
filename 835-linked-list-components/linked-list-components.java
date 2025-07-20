/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] nums) {

        HashMap <Integer, Integer> hm = new HashMap<>();

        int n = nums.length;

        for(int i = 0; i < n; i++) {

            hm.put(nums[i], i);

        }

        ListNode temp = head;

        boolean flag = false;

        int ans = 0;

        while(temp != null) {

            if(hm.containsKey(temp.val)) {

                if(flag == false) {
                    ans++;
                    flag = true;
                } 

            }else {
                flag = false;
            }

            temp = temp.next;
        }

        return ans;
        
    }
}