// Last updated: 10/20/2025, 11:47:09 AM
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
    List<Integer> list = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inOrder(root); 
        return list;
    }
    public void inOrder(TreeNode root) {
        if (root == null) return;
        
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }
}