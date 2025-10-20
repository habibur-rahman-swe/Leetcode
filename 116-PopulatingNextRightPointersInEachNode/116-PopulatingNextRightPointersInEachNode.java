// Last updated: 10/20/2025, 11:46:44 AM
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            Queue<Node> temp = new LinkedList<>();
            
            while (!queue.isEmpty()) {
                Node node = queue.poll();
                if (queue.size() > 0) {
                    node.next = queue.peek();
                }
                if (node != null && node.left != null) temp.offer(node.left);
                if (node != null && node.right != null) temp.offer(node.right);
            }
            queue = new LinkedList<>(temp);
        }

        return root;
    }
}