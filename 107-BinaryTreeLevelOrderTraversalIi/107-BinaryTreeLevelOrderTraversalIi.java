// Last updated: 10/20/2025, 11:46:53 AM
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<>(); 
		
        if (root == null) return res;
        
		Queue<TreeNode> queue = new LinkedList<>();
		Queue<TreeNode> tempQueue = new LinkedList<>();
		
		ArrayList<Integer> tempRes = new ArrayList<>();
		
		queue.add(root);
		
		while (queue.size() > 0) {
			tempQueue = new LinkedList<>();
			tempRes = new ArrayList<>();
			
			while (queue.size() > 0) {
				TreeNode treeNode = queue.peek();
				queue.poll();
				
				if (treeNode.left != null) {
					tempQueue.add(treeNode.left);
				}
				
				if (treeNode.right != null) {
					tempQueue.add(treeNode.right);
				}
				tempRes.add(treeNode.val);
			}
			queue = tempQueue;
			res.add(0, tempRes);
		}
        
        return res;
    }
}