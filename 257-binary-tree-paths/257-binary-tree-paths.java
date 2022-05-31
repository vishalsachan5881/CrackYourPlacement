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
    public static void fn(TreeNode root, List<String> ans, List<Integer> temp){
        
        if(root.left == null && root.right == null){
            String s = "";
            for(int i = 0;i<temp.size();i++)
                s += (temp.get(i) + "->");
            s += root.val;
            ans.add(s);
            return;
        }
        temp.add(root.val);
        if(root.left != null){
            fn(root.left, ans, temp);
        }
        if(root.right  != null)
            fn(root.right, ans, temp);
        
        temp.remove(temp.size()-1);
        
        
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        fn(root, ans, temp);
        return ans;
    }
}