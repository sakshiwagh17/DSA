class Solution {
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if (root == null)
            return depth;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            depth++;
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }

        }
        return depth;
    }
}

//recursive 
class Solution {
    public int maxDepth(TreeNode root) {
        if(root== null) return 0;
        int lh=maxDepth(root.left);
        int rh=maxDepth(root.right);
        return 1+Math.max(lh,rh);
    }
} 
