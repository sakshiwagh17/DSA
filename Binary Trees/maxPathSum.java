class Solution {
    int ans = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        height(root);
        return ans;
    }

    public int height(TreeNode node) {
        if (node == null)
            return 0;
        int lh = Math.max(0, height(node.left));
        int rh = Math.max(0, height(node.right));
        ans = Math.max(ans, lh + rh + node.val);
        return node.val + Math.max(lh, rh);
    }
}
