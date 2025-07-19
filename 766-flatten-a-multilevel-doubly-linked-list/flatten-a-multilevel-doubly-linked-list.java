/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {

        Stack <Node> st = new Stack<>();

        Node temp = head;

        while(temp != null) {

            if(temp.child != null) {
                if(temp.next != null) st.push(temp.next);
                temp.next = temp.child;
                temp.child = null;
                temp.next.prev = temp;
            } 

            if(temp.next == null && temp.child == null && !st.empty()) {
                temp.next = st.pop();
                temp.next.prev = temp;
            }
            temp = temp.next;
        }

        return head;
        
    }
}