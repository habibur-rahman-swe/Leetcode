// Last updated: 10/20/2025, 11:40:42 AM
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
    
    private int maxDiff = 0;

    public int maxAncestorDiff(TreeNode root) {
        int min = Integer.MAX_VALUE, max = 0;

        findDiff(root, max, min);

        return maxDiff;
    }

    private void findDiff(TreeNode root, int max, int min) {
        if (root == null) return;

        max = Math.max(max, root.val);
        min = Math.min(min, root.val);

        maxDiff = Math.max(maxDiff, max - min);

        findDiff(root.left, max, min);
        findDiff(root.right, max, min);
    }
}