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

    void doing(TreeNode root, List<List<Integer>> ans) {

        Queue <TreeNode> mid = new LinkedList<>();

        mid.add(root);

        while(!mid.isEmpty()) {

            int size = mid.size();

            List <Integer> level = new ArrayList<>();

            for(int i = 0; i < size; i++) {

                TreeNode temp = mid.poll();

                level.add(temp.val);

                if(temp.left != null) mid.add(temp.left);
                if(temp.right != null) mid.add(temp.right);

            }

            ans.add(level);
        }

    }
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) return ans;

        doing(root, ans);

        return ans;
        
    }
}