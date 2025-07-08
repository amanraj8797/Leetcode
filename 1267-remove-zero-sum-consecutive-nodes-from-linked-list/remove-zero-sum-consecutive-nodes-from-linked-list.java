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

 /*
 90 test cases passes: why not all => reason is we are not able to update value in hashmap for same key

  HashMap <Integer, ListNode> hm = new HashMap<>();

        ListNode curr = head;

        int sum = 0;

        while(curr != null) {

            sum += curr.val;

            if(sum == 0) {
                hm.clear();
                head = curr.next;
                curr = head;
                continue;
            }

            if(hm.containsKey(sum)) {
                hm.get(sum).next = curr.next;
            }else {
                hm.put(sum, curr);
            }

            curr = curr.next;
        }

        return head;
 */
class Solution {

    public ListNode removeZeroSumSublists(ListNode head) {

        HashMap <Integer, ListNode> hm = new HashMap<>();

        ListNode curr = head;

        int sum = 0;

        while(curr != null) {

            sum += curr.val;
            
            hm.put(sum, curr);

            curr = curr.next;
        }

        curr = head;
        sum = 0;

        while(curr != null) {

            sum += curr.val;

            if(sum == 0) {
                head = curr.next;
                curr = curr.next;
                continue;
            }

            curr.next = hm.get(sum).next;

            curr = curr.next;
        }

        return head;
       

    }
}