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
    public static int fn(TreeNode root, int[] ans){
        if(root == null) return 0;
        
        int left = 1 + fn(root.left,ans);
        int right = 1 + fn(root.right,ans);
        
        if(Math.abs(left-right) > 1){
           ans[0] = 1;
        }
        
        return Math.max(left, right);
    }
    public boolean isBalanced(TreeNode root) {
        int[] ans = new int[1];
       fn(root,ans);
        if(ans[0] ==0) return true;
        return false;
    }
}