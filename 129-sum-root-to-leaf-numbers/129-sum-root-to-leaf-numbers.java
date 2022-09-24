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
    public void fn(TreeNode root, int sum, int[] ans){
        if(root == null) return ;
        
        if(root.left == null && root.right == null) {
            ans[0] += ((sum*10)+root.val);
            return;
        }
        
        sum = sum*10+root.val;
        fn(root.left, sum, ans);
        fn(root.right, sum , ans);
        sum = sum / 10;
    }
    public int sumNumbers(TreeNode root) {
        int[] ans = new int[1];
        fn(root, 0, ans);
        return ans[0];
    }
}