class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr=new LinkedList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<>();
        // Queue<TreeNode> q1=new LinkedList<>();
        if(root==null)
            return arr;
        q.offer(root);
        while(!q.isEmpty()){
            ArrayList<Integer> ar = new ArrayList<Integer>();
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                
                if(node != null){
                    ar.add(node.val);
                    q.add(node.left);
                    q.add(node.right);  
                }
            }
            if(ar.size()>0)
            arr.add(ar);
            
        }
        return arr;
        
        
    }
}
