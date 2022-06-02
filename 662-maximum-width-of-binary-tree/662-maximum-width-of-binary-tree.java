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
class Pair{
    TreeNode node;
    int index;
    public Pair(TreeNode node, int index){
        this.node  = node;
        this.index  = index;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Deque<Pair>  q= new LinkedList<>();
        int max = 1;
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            int  n = q.size();
            max = Math.max(max, (q.peekLast().index - q.peek().index +1));
            for(int   i = 0 ; i<n;i++){
                Pair p  = q.poll();
                TreeNode node = p.node;
                int index = p.index;
                
                if(node.left != null)
                    q.offer(new Pair(node.left, 2*index+1));
                if(node.right != null)
                    q.offer(new Pair(node.right, 2*index+2));
                
                
                
            }
            
        }
        return max;
        
    }
}