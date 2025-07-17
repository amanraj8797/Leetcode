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

    int doing(TreeNode root, int curr) {

        if(root == null) return --curr;

        return Math.max(doing(root.left, curr + 1), doing(root.right, curr + 1));

    }
    public int maxDepth(TreeNode root) {

        if(root == null) return 0;

        return doing(root, 1);
        
    }
}