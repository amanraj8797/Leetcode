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
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null) return head;

        HashMap <Integer, Integer> hm = new HashMap<>();

        ListNode curr = head;

        while(curr != null) {
            hm.put(curr.val, hm.getOrDefault(curr.val, 0) + 1);
            curr = curr.next;
        }

        curr = head;

        ListNode prev = null;

        while(curr != null) {

            if(hm.get(curr.val) == 1) {
                if(prev == null) {
                    head = curr;
                    prev = curr;
                } else {
                    prev.next = curr;
                    prev = curr;
                }
            }
            curr = curr.next;
        }

        if(prev == null) return prev;

        prev.next = curr;
        prev = curr;

        return head;
        
    }
}