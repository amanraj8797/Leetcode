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
    public ListNode rotateRight(ListNode head, int n) {

        if(n == 0 || head == null || head.next == null) return head;

        int tNodes = 1;

        ListNode curr = head;

        while(curr.next != null) {
            curr = curr.next;
            tNodes += 1;
        }

        curr.next = head;

        ListNode x = head;

        n %= tNodes;

        n = tNodes - n;

        while(x != null && n > 1) {
            x = x.next;
            n--;
        }

        if(x != null) {
            head = x.next;
            x.next = null;
        }

        return head;       
        
    }
}