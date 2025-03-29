class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        preorder(root,arr);
        return arr;
        
    }
    public void preorder(TreeNode node,List<Integer> arr){
        if(node==null) return ;
        arr.add(node.val);
        preorder(node.left,arr);
        preorder(node.right,arr);
    }
}
