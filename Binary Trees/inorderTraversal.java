class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList();
        inorder(root, arr);
        return arr;

    }

    public void inorder(TreeNode node, List<Integer> arr) {
        if (node == null)
            return;
        inorder(node.left, arr);
        arr.add(node.val);
        inorder(node.right, arr);
    }
}
