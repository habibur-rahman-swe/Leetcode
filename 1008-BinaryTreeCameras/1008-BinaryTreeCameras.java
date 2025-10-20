// Last updated: 10/20/2025, 11:41:06 AM
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
    int cam = 0;
    HashSet<TreeNode> covered;
    public int minCameraCover(TreeNode root) {
        covered = new HashSet<>();
        if (root == null) return 0;
        covered.add(null);
        postOrder(root, null);
        return cam;
    }
    
    public void postOrder(TreeNode root, TreeNode parent) {
        if (root == null) return;
        
        postOrder(root.left, root);
        postOrder(root.right, root);
        
        if ((parent == null && !covered.contains(root)) || !covered.contains(root.left) || !covered.contains(root.right)) {
            covered.add(root);
            covered.add(root.left);
            covered.add(root.right);
            covered.add(parent);
            ++cam;
        }
    }
}