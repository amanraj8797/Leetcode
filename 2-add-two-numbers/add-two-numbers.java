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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode ans = null, curr = null;

        int mid = 0;

        while(l1 != null && l2 != null) {

            mid = l1.val + l2.val + mid;

            ListNode node = new ListNode(mid % 10);

            mid /= 10;

            if(ans == null) {
                ans = node;
                curr = node;
            } else {
                curr.next = node;
                curr = curr.next;
            }            

            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null) {

            mid += l1.val;

            ListNode node = new ListNode(mid % 10);

            mid /= 10;

            curr.next = node;
            curr = curr.next;

            l1 = l1.next;

        }

        while(l2 != null) {

            mid += l2.val;

            ListNode node = new ListNode(mid % 10);

            mid /= 10;

            curr.next = node;
            curr = curr.next;

            l2 = l2.next;

        }

        if(mid != 0) {

            ListNode node = new ListNode(mid % 10);

            curr.next = node;
            curr = curr.next;
        }

        return ans;
        
    }
}