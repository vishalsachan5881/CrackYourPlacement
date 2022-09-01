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
    public TreeNode fn(TreeNode root, int val){
        if(root == null) return null;
        
        if(root.val == val) return root;
        
        if(val > root.val) return fn(root.right, val);
        else return fn(root.left, val);
    }
    public TreeNode searchBST(TreeNode root, int val) {
        return fn(root, val);
    }
}