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
    
    public void fn(TreeNode node, List<Integer> ans, int level){
        
        if(node == null) return ;
        if(ans.size() == level) ans.add(node.val);
        fn(node.right, ans, level+1);
        fn(node.left, ans, level+1);
        
        
    }
    
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ls= new ArrayList<>();
        fn(root, ls, 0);
        return ls;
    }
}