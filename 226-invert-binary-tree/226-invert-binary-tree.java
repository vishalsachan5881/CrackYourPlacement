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
    public void fn(TreeNode root){
        if(root == null) return;
        invertTree(root.left);
        invertTree(root.right);
        
        TreeNode node = new TreeNode();
        node = root.left;
        root.left = root.right;
        root.right = node;
    }
    public TreeNode invertTree(TreeNode root) {
        fn(root);
        return root;
        
    }
}