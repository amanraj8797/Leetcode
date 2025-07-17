class Solution {

    int doing(TreeNode root, int currDepth) {
        if (root == null) return currDepth - 1;

        int leftDepth = doing(root.left, currDepth + 1);
        int rightDepth = doing(root.right, currDepth + 1);

        return Math.max(leftDepth, rightDepth);
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return doing(root, 1);
    }
}
