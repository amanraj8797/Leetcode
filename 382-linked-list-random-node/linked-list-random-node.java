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

    ListNode temp;

    ArrayList <Integer> midStore = new ArrayList<>();

    public Solution(ListNode head) {

        temp = head;

        while(temp != null) {
            midStore.add(temp.val);
            temp = temp.next;
        }
        
    }
    

    public int getRandom() {

        int size = midStore.size();

        return midStore.get((int)(Math.random() * size));
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */