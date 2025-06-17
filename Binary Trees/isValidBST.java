class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    private boolean helper(TreeNode root, Integer low, Integer high) {
        if (root == null)
            return true;
        if (low != null && root.val <= low) {
            return false;
        }
        if (high != null && root.val >= high) {
            return false;
        }

        boolean leftTree = helper(root.left, low, root.val);
        boolean rightTree = helper(root.right, root.val, high);

        return leftTree && rightTree;
    }
}
