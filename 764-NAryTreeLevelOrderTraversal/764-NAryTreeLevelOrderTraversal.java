// Last updated: 10/20/2025, 11:42:29 AM
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
        List<List<Integer>> res = new ArrayList<>();
        
        if (root == null) return res;
        
        Queue<Node> queue = new LinkedList<>();
        Queue<Node> tQueue = new LinkedList<>();
        
        queue.add(root);
        
        List<Integer> list;
        
        while (!queue.isEmpty()) {
            tQueue = new LinkedList<>();
            list = new ArrayList<>();
            
            while (!queue.isEmpty()) {
                for (Node node : queue.peek().children) {
                    if (node == null) continue;
                    tQueue.add(node);
                }
                list.add(queue.peek().val);
                queue.poll();
            }
            res.add(list);
            queue = new LinkedList<>(tQueue);
        }
        
        return res;
    }
}