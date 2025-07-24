/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    int doing(TreeNode root, int ans) {

        Queue <TreeNode> Q = new LinkedList<>();

        Q.add(root);

        outer: while(!Q.isEmpty()) {

            int size = Q.size();

            for(int i = 0; i < size; i++) {
                TreeNode mid = Q.poll();

                if(mid.left == null && mid.right == null) break outer;

                if(mid.left != null) Q.add(mid.left);
                if(mid.right != null) Q.add(mid.right);

            }
            ans++;
        }

        return ans;
    }
    public int minDepth(TreeNode root) {

        if(root == null) return 0;

        return doing(root, 1);
        
    }
}