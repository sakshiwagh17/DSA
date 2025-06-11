class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        if (root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        boolean reverse = false;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelList = new ArrayList();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                if (!reverse) {
                    levelList.add(currentNode.val);
                } else {
                    levelList.add(0, currentNode.val);
                }
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
            reverse = !reverse;
            result.add(levelList);
        }
        return result;
    }
}
