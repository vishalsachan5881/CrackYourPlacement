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
   
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            return new TreeNode(val, root, null);
        }
        int level = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int n = q.size();
            for(int i = 0 ; i < n ; i++){
                TreeNode curr = q.poll();
                   
                TreeNode left = curr.left, right = curr.right;
                 if(left != null) q.offer(left);
                 if(right != null) q.offer(right);
                
                
                if(level == depth-1){
                    TreeNode node = new TreeNode(val, null,null);
                    
                       
                        node.left = left;
                        curr.left = node;
                    
                    TreeNode node1 = new TreeNode(val, null,null);
                     
                       
                        node1.right = right;
                        curr.right = node1;
                    
                }
               
            }
               //System.out.println();
            level++;
        }
        
        //preorder(root);
        
        return root;
    
    }
}