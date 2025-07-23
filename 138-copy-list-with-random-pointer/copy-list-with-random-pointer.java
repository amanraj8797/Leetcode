/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {

    Node ans = null;

    void doing(Node root) {

        int val = root.val;

        Node newNode = new Node(val);

        if(ans == null) {
            ans = newNode;
            return;
        }

        Node curr = ans;

        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    void random(Node head) {

        HashMap <Node, Node> hm = new HashMap<>();

        Node temp = head;

        Node temp1 = ans;

        while(temp != null) {
            Node x = temp.random;

            Node curr = head;
            Node curr2 = ans;

            while(curr != x) {
                curr = curr.next;
                curr2 = curr2.next;
            }

            temp1.random = curr2;
            temp1 = temp1.next;
            temp = temp.next;
        }

        
    }


    public Node copyRandomList(Node head) {

        if(head == null) return ans;

        Node temp = head;

        while(temp != null) {
            doing(temp);
            temp = temp.next;
        }

        random(head);


        return ans;
        
    }
}