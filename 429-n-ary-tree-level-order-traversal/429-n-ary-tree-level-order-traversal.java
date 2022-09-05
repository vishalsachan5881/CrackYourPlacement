/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
         Queue<Node> q = new LinkedList<>();
        q.offer(root);
        if(root == null) return ans;
        
        while(!q.isEmpty()){
            int n = q.size();
            temp = new ArrayList<>();
            for(int i = 0 ; i  < n  ; i++){
               Node node = q.poll();
                temp.add(node.val);
                for(var v : node.children)
                    q.offer(v);
                
                
                
            }
            ans.add(new ArrayList<>(temp));
            
        }
        return ans;
        
    }
}