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
    HashMap<Integer,Integer> hm = new HashMap<>();
    int flag = 0;
    public  void pre(TreeNode root, int t){
        if(root == null) return;
        
        if(hm.containsKey(t-root.val)){
            flag = 1;
        }
        else hm.put(root.val, 1);
        
        pre(root.left, t);
        pre(root.right, t);
    }
    public boolean findTarget(TreeNode root, int k) {
        pre(root,k);
            return (flag==1);
    }
}