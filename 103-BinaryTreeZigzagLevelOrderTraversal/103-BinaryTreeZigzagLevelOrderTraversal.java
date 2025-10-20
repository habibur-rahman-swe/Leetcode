// Last updated: 10/20/2025, 11:46:57 AM
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        List<Integer> tp = new ArrayList<>();
        tp.add(root.val);
        result.add(tp);
        int idx = 0;

        while (!queue.isEmpty()) {
            Queue<TreeNode> temp = new LinkedList<>();

            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();

                if (node.left != null) temp.add(node.left);
                if (node.right != null) temp.add(node.right);
            }

            List<TreeNode> list = new ArrayList<>(temp);
            
            if (idx % 2 == 0) {
                Collections.reverse(list);
            }
            
            List<Integer> l = new ArrayList<>();
            for (TreeNode n : list) {
                l.add(n.val);
            }
            if (l.size() > 0)result.add(l);
            queue = new LinkedList<>(temp);
            idx++;
        }

        return result;
    }
}