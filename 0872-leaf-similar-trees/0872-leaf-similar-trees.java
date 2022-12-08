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
    public void fn(TreeNode root,ArrayList<Integer> temp){
        if(root == null) return;
        if(root.left == null && root.right == null) temp.add(root.val);
        
        fn(root.left, temp);
        fn(root.right, temp);
        
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> temp1 = new ArrayList<>();
        fn(root1, temp);
        fn(root2, temp1);
        if(temp1.size() != temp.size()) return false;
        for(int i = 0 ; i < temp.size();i++)
            if(temp.get(i) != temp1.get(i)) return false;
        return true;
        
    }
}