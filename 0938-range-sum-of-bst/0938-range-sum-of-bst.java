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
    public void fn(TreeNode root, int low, int high, int[]sum){
        if(root == null) return;
        
        if(root.val >= low && root.val <= high) sum[0] += root.val;
        
        fn(root.left, low, high, sum);
        fn(root.right, low, high, sum);
        
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        int[] sum = new int[1];
        fn(root, low, high, sum);
        return sum[0];
    }
}