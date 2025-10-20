// Last updated: 10/20/2025, 11:38:20 AM
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
    public boolean isEvenOddTree(TreeNode root) {
        int level = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {        
            int n = queue.size();

            int prev = level % 2 == 0 ? 0 : Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);

                if (level % 2 == 0) {
                    if (prev < node.val && node.val % 2 == 1) prev = node.val;
                    else return false;
                } else {
                    if (prev > node.val && node.val % 2 == 0) prev = node.val;
                    else return false;
                }
            }
            
            level++;
        }
        return true;
    }
}