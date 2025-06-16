class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return bts(nums, 0, nums.length - 1);
    }

    private TreeNode bts(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int middle = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[middle]);
        root.left = bts(nums, left, middle - 1);
        root.right = bts(nums, middle + 1, right);
        return root;
    }
}
