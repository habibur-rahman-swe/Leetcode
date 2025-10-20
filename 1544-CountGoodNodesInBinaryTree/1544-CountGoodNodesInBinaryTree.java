// Last updated: 10/20/2025, 11:39:04 AM
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
    public int cnt = 0;
    public int goodNodes(TreeNode root) {
        
        getRes(root, Integer.MIN_VALUE);
        
        return cnt;
    }
    
    public void getRes(TreeNode root, int max) {
        if (root == null) return;
        if (root.val >= max) {
            max = root.val;
            ++cnt;
        }
        
        getRes(root.left, max);
        getRes(root.right, max);
    }
}