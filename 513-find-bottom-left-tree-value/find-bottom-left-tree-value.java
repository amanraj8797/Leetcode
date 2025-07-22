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

        int ans = 0;

        Queue <TreeNode> Q = new LinkedList<>();

        Q.add(root);

        while(!Q.isEmpty()) {

            int size = Q.size();

            for(int i = 0; i < size; i++) {
                TreeNode mid = Q.poll();

                if(i == 0) ans = mid.val;

                if(mid.left != null) Q.add(mid.left);
                if(mid.right != null) Q.add(mid.right);

            }
        }

        return ans;

    }

    public int findBottomLeftValue(TreeNode root) {

        return doing(root);
        
    }
}