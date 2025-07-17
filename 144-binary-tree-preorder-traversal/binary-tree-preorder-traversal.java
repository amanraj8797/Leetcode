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

    void doing(TreeNode root, ArrayList <Integer> ans) {

        if(root == null) return;

        ans.add(root.val);
        doing(root.left, ans);
        doing(root.right, ans);
    }
    public List<Integer> preorderTraversal(TreeNode root) {

        ArrayList<Integer> ans = new ArrayList<>();

        doing(root, ans);

        return ans;
        
    }
}