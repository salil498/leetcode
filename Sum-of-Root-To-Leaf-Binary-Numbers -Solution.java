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
    int sum(TreeNode root,String val){
        if(root==null)
            return 0;
        val = val + root.val; 

        if (root.left == null && root.right == null) 
            return Integer.parseInt(val,2); 
   
        // recur sum of values for left and right subtree 
        return sum(root.left, val) 
                + sum(root.right, val);
    } 
    public int sumRootToLeaf(TreeNode root) {
        int x=sum(root,"");
            return x;
        }
        
    
}
