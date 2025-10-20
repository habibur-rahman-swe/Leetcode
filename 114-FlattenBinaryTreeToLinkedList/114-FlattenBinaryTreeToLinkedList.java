// Last updated: 10/20/2025, 11:46:47 AM
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
    List<Integer> list;
    public void flatten(TreeNode root) {
        list = new ArrayList<>();
        preOrder(root);
        
        for (int i = 1; i < list.size(); i++) {
            root.left = null;
            root.right = new TreeNode(list.get(i));
            root = root.right;
        }
    }
    
    public void preOrder(TreeNode root) {
        if (root == null) return;
        
        list.add(root.val);
        
        preOrder(root.left);
        preOrder(root.right);
    }
}