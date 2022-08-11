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
    public void in(TreeNode root,ArrayList<Integer>arr)
    {
        if(root == null) return;
        in(root.left,arr);
        arr.add(root.val);
        in(root.right, arr);
    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        in(root,arr);
        for(int i = 1;i<arr.size();i++){
            if(arr.get(i) <= arr.get(i-1))
                return false;
        }
        return true;
    }
}