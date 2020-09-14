/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> arr=new LinkedList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
            return arr;
        q.offer(root);
        int level=0;
        while(!q.isEmpty()){
            List<Integer> ar = new ArrayList<Integer>();
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                
                if(node != null){
                    ar.add(node.val);
                    q.add(node.left);
                    q.add(node.right);  
                }
            }
            if(ar.size()>0){
                if(level%2==0)
                    arr.add(ar);
                else{
                    Collections.reverse(ar);
                    arr.add(ar);
                }
                    
                level++;
                
            }
                
            
        }
        return arr;        
    }
}
