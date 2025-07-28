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
    public ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode curr = head.next;
        ListNode prev = head;

        ListNode x = null;
        

        while(curr != null && curr.next != null) {

            ListNode temp = curr.next;
            
            if(prev == head) {
                curr.next = prev;
                prev.next = temp;
                head = curr;
                x = prev;
            } 
            else {
                curr.next = prev;
                prev.next = temp;
                x.next = curr;
            }

            x = prev;
            prev = prev.next;
            curr = prev.next;

        }

        if(curr != null && curr.next == null) {

            ListNode temp = curr.next;
            curr.next = prev;
            prev.next = temp;
            
            if(x == null) {
                head = curr;
                return head;
            }
            
            x.next = curr;   
        }

        return head;        
    }
}