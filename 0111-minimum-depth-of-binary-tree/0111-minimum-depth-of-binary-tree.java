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
        // if(root == null) return Integer.MAX_VALUE;
        // if(root.left == null && root.right == null) return 1;
        // return 1 + (Math.min(minDepth(root.left) , minDepth(root.right)));
        if(root.left == null && root.right == null) return 1;
        int left = 10000, right = 10000;
        if(root.left != null) left = fn(root.left);
        if(root.right != null) right = fn(root.right);
        
        return 1 + Math.min(left , right);
    }
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int ans = fn(root);
        return ans;
    }
}