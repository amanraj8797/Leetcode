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
  public TreeNode lcaDeepestLeaves(TreeNode root) {
    return dfs(root).lca;
  }

  private class Result {
    TreeNode lca;
    int depth;

    Result(TreeNode lca, int depth) {
      this.lca = lca;
      this.depth = depth;
    }
  }

  private Result dfs(TreeNode root) {
    if (root == null)
      return new Result(null, 0);
    
    Result left = dfs(root.left);
    Result right = dfs(root.right);
    
    if (left.depth > right.depth)
      return new Result(left.lca, left.depth + 1);
    if (left.depth < right.depth)
      return new Result(right.lca, right.depth + 1);
    
    return new Result(root, left.depth + 1);
  }
}
