// Last updated: 10/20/2025, 11:46:59 AM
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Queue<TreeNode> temp = new LinkedList<>();
            List<Integer> list = new ArrayList<>();

            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                list.add(node.val);

                if (node.left != null) temp.add(node.left);
                if (node.right != null) temp.add(node.right);
            }
            result.add(list);
            queue = new LinkedList<>(temp);
        }

        return result;
    }
}