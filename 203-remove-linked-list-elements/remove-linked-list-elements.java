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
    public ListNode removeElements(ListNode head, int val) {

        ListNode temp = head;
        ListNode prev = null;

        boolean flag = false, sFlag = false;

        while(temp != null) {

            if(temp.val == val) {

                if(flag == false) {
                    head = prev;
                    temp = temp.next;
                } else {

                    prev.next = temp.next;
                    temp = temp.next;
                }

            } else {      

                if(sFlag == false) {
                    head = temp;
                    sFlag = true;
                }

                flag = true;
                prev = temp;
                temp = temp.next;
            }

        }

        return head;
    }
}