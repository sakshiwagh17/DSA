class Solution {
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    public int height(TreeNode node) {
        if (node == null)
            return 0;
        int maxlh = height(node.left);
        int maxlr = height(node.right);
        diameter = Math.max(diameter, maxlh + maxlr);
        return 1 + Math.max(maxlh, maxlr);
    }
}
