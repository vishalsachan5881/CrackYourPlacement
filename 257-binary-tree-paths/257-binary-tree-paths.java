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
    public void fn(TreeNode root,String al,List<String>ans){
        if(root.left==null&&root.right==null){
            //al.append("->"+root.val);
            al += ("->"+root.val);
            //al.delete(0,1);
            ans.add(al.substring(3));
            return;
        }
        
        if(root.left!=null){
            fn(root.left,al+"->"+root.val,ans);
        }
        
        if(root.right!=null){
            fn(root.right,al+"->"+root.val,ans);
        }
       
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        String al = " ";
        fn(root,al,ans);
        System.out.println(ans);
        return ans;
    }
}