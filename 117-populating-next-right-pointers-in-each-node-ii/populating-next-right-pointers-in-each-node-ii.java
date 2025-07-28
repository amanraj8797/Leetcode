/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {

    void doing(Node root) {
        Queue <Node> Q = new LinkedList<>();

        Q.add(root);

        while(!Q.isEmpty()) {
            int size = Q.size();

            Node prev = Q.poll();

            if(prev.left != null) Q.add(prev.left);
            if(prev.right != null) Q.add(prev.right);

            for(int i = 1; i < size; i++) {
                Node temp = Q.poll();

                prev.next = temp;

                if(temp.left != null) Q.add(temp.left);
                if(temp.right != null) Q.add(temp.right);

                prev = temp;
            }

            prev.next = null;
        }

    }
    public Node connect(Node root) {

        if(root == null) return root;

        doing(root);

        return root;
    }
}