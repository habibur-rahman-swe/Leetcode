// Last updated: 10/20/2025, 11:43:42 AM
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
    private int ans = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        getAns(root);
        return ans;
    }

    private int getAns(TreeNode root) {
        if (root == null) return 0;
        int left = 0, right = 0;
        left = Math.max(left, 1 + getAns(root.left));
        right = Math.max(right, 1 + getAns(root.right));
        ans = Math.max(left + right - 2, ans);
        return Math.max(left, right);
    }
}