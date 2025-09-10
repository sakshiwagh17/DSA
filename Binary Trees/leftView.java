class Solution {
    ArrayList<Integer> leftView(Node root) {
        // code here
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        q.add(root);
        if(root==null) return ans;
        while(!q.isEmpty()){
            int n=q.size();
             
           for(int i=0;i<n;i++){
                Node temp=q.poll();
                if(i==0){
                    ans.add(temp.data);
                }
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            
        }
        return ans;
        
    }
}
