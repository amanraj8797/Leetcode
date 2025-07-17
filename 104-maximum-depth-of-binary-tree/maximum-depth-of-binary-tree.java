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

    int doing(TreeNode root) {

        Queue <TreeNode> mid = new LinkedList<>();

        int ans = 0;

        mid.add(root);

        while(!mid.isEmpty()) {

            int size = mid.size();

            for(int i = 0; i < size; i++) {

                TreeNode temp = mid.poll();

                if(temp.left != null) {
                    mid.add(temp.left);
                }
                if(temp.right != null) {
                    mid.add(temp.right);
                }

            }
            ans++;
        }

        return ans;
    }
    public int maxDepth(TreeNode root) {

        if(root == null) return 0;

        return doing(root);
        
    }
}