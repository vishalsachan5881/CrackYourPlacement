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
         
        if(root == null) return;
        //System.out.println(al);
        if(root.left == null && root.right == null){
            al.add(root.val);
           // System.out.println(al);
            ans.add(new ArrayList<>(al));
            al.remove(al.size()-1);
            return;
        }
        
        al.add(root.val);
        fn(root.left, al, ans);
        fn(root.right, al, ans);
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


// public List<String> binaryTreePaths(TreeNode root) {
// 	List<String> res = new LinkedList<>();
// 	backTracking(root, res, new ArrayList<>(), new StringBuilder());
// 	return res;
// }
// private void backTracking(TreeNode node, List<String> collector, List<Integer> tmp, StringBuilder sb) {
// 	if (node.left == null && node.right == null) {
// 		for (int val : tmp) {
// 			sb.append(val).append("->");
// 		}
// 		sb.append(node.val);
// 		collector.add(sb.toString());
// 		sb.setLength(0);
// 		return;
// 	}
// 	tmp.add(node.val);
// 	if (node.left != null) backTracking(node.left, collector, tmp, sb);
// 	if (node.right != null) backTracking(node.right, collector, tmp, sb);
// 	tmp.remove(tmp.size()-1);
// }