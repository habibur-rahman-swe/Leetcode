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
    public int sum = 0;
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        doSum(root, 0);
        return sum;
    }
    
    public void doSum(TreeNode root, int val) {
        val = val * 10 + root.val;
        
        if (root.left == null && root.right == null) {
            sum += val;
            return;
        }
        
        if (root.left != null) doSum(root.left, val);
        if (root.right != null) doSum(root.right, val);
    }
}