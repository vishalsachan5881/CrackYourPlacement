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
   public boolean findTarget(TreeNode root, int k) {
    return run(root, root, k);
}

public boolean run(TreeNode root, TreeNode currentNode, int k) {
    if (currentNode == null) return false;
    if (find(root, k-currentNode.val, currentNode)) return true;
    
    return run(root, currentNode.left, k) || run(root, currentNode.right, k);
}

public boolean find(TreeNode root, int val, TreeNode current) {
    if (root == null) return false;
    if (val > root.val) return find(root.right, val, current);
    else if (val < root.val) return find(root.left, val, current);
    else if (val == root.val) return root != current;
    
    return false;
}
}