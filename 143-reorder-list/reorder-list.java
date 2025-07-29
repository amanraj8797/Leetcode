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
    public void reorderList(ListNode head) {

        Stack <ListNode> st = new Stack<>();

        if(head == null || head.next == null) return;

        int n = 0;

        ListNode curr = head;

        while(curr != null) {
            st.push(curr);
            curr = curr.next;
            n++;
        }

        int t = (n + 1)/2;

        curr = head.next;
        ListNode prev = head, x = null;

        while(curr != null && t > 0) {
            ListNode temp = st.pop();

            prev.next = temp;
            temp.next = curr;

            x = prev;
            prev = curr;
            curr = curr.next;

            t--;
        }

        if(n % 2 == 0) prev.next = null;   
        else x.next = null; 

        
    }
}