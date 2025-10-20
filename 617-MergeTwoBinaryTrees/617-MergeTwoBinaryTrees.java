// Last updated: 10/20/2025, 11:43:13 AM
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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode root = merge(root1, root2);
        return root;
    }

    private TreeNode merge(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return null;
        TreeNode node = null;
        if (root1 != null && root2 != null) {
            node = new TreeNode(root1.val + root2.val);
            node.left = merge(root1.left, root2.left);
            node.right = merge(root1.right, root2.right);
        }
        
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        return node;
    }
}