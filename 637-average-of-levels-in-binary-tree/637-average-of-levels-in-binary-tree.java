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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        
        List<Double> ans = new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()){
            double sum = 0 ;
            double avg = 0;
            int n = q.size();
            for(int i = 0 ; i< n ; i++){
                TreeNode temp  = q.poll();
                sum+=temp.val;
                
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
                
            }
           
            //avg = new Double(String.format("%0.5f",(sum/n)));
            avg = (sum/(n*1.0));
            ans.add(avg);
            
            
        }
        return ans;
    }
}