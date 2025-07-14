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
    public int getDecimalValue(ListNode head) {

        int len = 0;

        ListNode temp = head;

        while(temp != null) {
            len++;
            temp = temp.next;
        }

        long ans = 0;

        while(head != null) {

            len--;

            if(head.val != 0)
            {
                ans = ans + (int)Math.pow(2, len);
            }

            head = head.next;

        }

        return (int)ans;
        
    }
}