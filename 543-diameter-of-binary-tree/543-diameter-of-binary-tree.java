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
    int ans = -1;
    public int diameterOfBinaryTree(TreeNode root) {
        maxHeight(root);
        return ans;
    }
    
    public int maxHeight(TreeNode root) {
        if(root == null) return 0;
        int lh = maxHeight(root.left);
        int rh = maxHeight(root.right);
        ans = Math.max(ans, lh + rh);
        return 1+Math.max(lh, rh);
    }
}