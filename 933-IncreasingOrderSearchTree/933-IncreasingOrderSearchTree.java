// Last updated: 10/20/2025, 11:41:33 AM
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
    public ArrayList<Integer> list = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        inOrder(root);
        
        TreeNode head = createTree(list);
        return head;
    }
    
    public TreeNode createTree(ArrayList<Integer> list) {
        if (list.size() == 0) return null;
        TreeNode temp = new TreeNode(list.get(0));
        list.remove(0);
        
        temp.right = createTree(list);
        return temp;
    }
    
    public void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }
}