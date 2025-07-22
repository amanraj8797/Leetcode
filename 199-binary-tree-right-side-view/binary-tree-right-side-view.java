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

    void doing(TreeNode root, List<Integer> ans) {

        if(root == null) return;

        Queue<TreeNode> Q = new LinkedList<>();

        Q.offer(root);

        while(!Q.isEmpty()) {

            int size = Q.size();

            TreeNode midAnsNode = null;

            for(int i = 0; i < size; i++) {
                
                TreeNode curr = Q.poll();

                midAnsNode = curr;

                if(curr.left != null) Q.offer(curr.left);
                    if(curr.right != null) Q.offer(curr.right);

            }
            ans.add(midAnsNode.val);
        }
    }

    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();

        doing(root, ans);

        return ans;
    }
}