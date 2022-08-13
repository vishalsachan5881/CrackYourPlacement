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
    public void fn(TreeNode root,List<Integer> al,List<List<Integer>>ans){
         
        //if(root == null) return;
        //System.out.println(al);
        if(root.left == null && root.right == null){
            al.add(root.val);
           // System.out.println(al);
            ans.add(new ArrayList<>(al));
            al.remove(al.size()-1);
            return;
        }
        
        al.add(root.val);
        if(root.left != null)fn(root.left, al, ans);
        if(root.right != null) fn(root.right, al, ans);
        al.remove(al.size()-1);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        fn(root, al, ans);
        List<String> anss  = new ArrayList<>();
        for(var v: ans){
            String temp = "";
            for(int i = 0 ; i<v.size();i++){
                if(i!=v.size()-1) temp+=(v.get(i)+"->");
                else temp+= v.get(i);
            }
            anss.add(temp);
        }
        System.out.println(ans);
        return anss;
    } 
}


