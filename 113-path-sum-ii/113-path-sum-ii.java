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
    public void fn(TreeNode root,List<List<Integer>> ans, List<Integer> temp,int sum, int targetSum){
        if(root == null) return;
        if(root.left == null && root.right == null && sum+root.val == targetSum){
            temp.add(root.val);
            ans.add(new ArrayList<>(temp));
            temp.remove(temp.size()-1);
            return;
        }
        sum += root.val;
        temp.add(root.val);
        fn(root.left, ans, temp, sum, targetSum);
        fn(root.right, ans, temp, sum, targetSum);
        temp.remove(temp.size()-1);
        
        
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int sum =0;
        fn(root, ans, temp, sum, targetSum);
        return ans;
    }
}