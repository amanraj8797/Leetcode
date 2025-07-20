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
    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next == null) return head;
        
        ListNode temp = head.next;
        ListNode prev = head;

        Queue <ListNode> mid = new LinkedList<>();

        int i = 2;

        while(temp != null) {

            if(i % 2 == 0) {
                mid.add(temp);
            }else {
                prev.next = temp;
                prev = temp;
            }
            i++;
            temp = temp.next;
        }

        while(!mid.isEmpty()) {

            ListNode x = mid.poll();

            prev.next = x;
            prev = x;

        }

        prev.next = null;

        return head;
        
    }
}