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
    public static void fn(TreeNode node, int sum, int t, List<List<Integer>> ans, List<Integer> al){
        if(node == null) return;
        if(node.left == null && node.right == null && sum + node.val == t){
            al.add(node.val);
            ans.add(new ArrayList<>(al));
            al.remove(al.size()-1);
            return;
        }
        
        sum += node.val;
        al.add(node.val);
        
        fn(node.left, sum, t , ans, al);
        fn(node.right, sum, t, ans, al);
        al.remove(al.size()-1);
        
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        fn(root, 0, targetSum, ans, al);
        return ans;
    }
}