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
    public int fn(TreeNode root){
        if(root == null) return 0;
        if(root.left == null && root.right == null){
            if(root.val == 1) return 1;
            else return 0;
        }
        
        
        int l = fn(root.left);
        int r = fn(root.right);
        
        if(l==0) root.left = null;
        if(r == 0) root.right = null;
        
        return l+r+root.val;
    }
    public TreeNode pruneTree(TreeNode root) {
        
        int a = fn(root);
        return (a==0) ? null : root;
    }
}