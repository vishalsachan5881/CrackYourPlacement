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
class pair{
    TreeNode node;
    int level;
    public pair(TreeNode node, int level){
        this.node = node;
        this.level = level;
    }
}
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<pair> q = new LinkedList<>();
        q.offer(new pair(root, 1));
        
        while(!q.isEmpty()){
            pair p = q.poll();
            TreeNode parent = p.node;
            int pl = p.level;
            
            if(parent.left == null && parent.right == null) return pl;
            
            if(parent.left != null) q.offer(new pair(parent.left, pl+1));
            if(parent.right != null) q.offer(new pair(parent.right, pl+1));
        }
        
        return -1;
    }
}