// Last updated: 10/20/2025, 11:46:43 AM
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
        setRes(root);
        return root;
    }
    
    void setRes(Node root) {
        if (root == null) return;
        
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while (q.size() > 0) {
			int size = q.size();
			Node node;
			Node prev = null;
			
			while (size-- > 0) {
				node = q.remove();
				
				if (prev == null) prev = node;
				else {
					prev.next = node;
					prev = node;
				}
				
				if (node.left != null) q.add(node.left);
				if (node.right != null) q.add(node.right);
			}
		}
	}
}