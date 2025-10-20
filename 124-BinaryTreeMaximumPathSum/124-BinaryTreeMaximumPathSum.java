// Last updated: 10/20/2025, 11:46:34 AM
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
    private int maxSum;
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;

        gainFromSubTree(root);

        return maxSum;
    }

    private int gainFromSubTree(TreeNode root) {
		if (root == null) {
			return 0;
		}
		
		int gainFromLeft = Math.max(gainFromSubTree(root.left), 0);
		
		int gainFromRight = Math.max(gainFromSubTree(root.right), 0);
		
		maxSum = Math.max(maxSum, gainFromLeft + gainFromRight + root.val);
		
		return Math.max(gainFromLeft + root.val, gainFromRight + root.val);
	}
}