// Last updated: 10/20/2025, 11:34:26 AM
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
    public long kthLargestLevelSum(TreeNode root, int k) {
        long max = 0;
        long sum = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        List<Long> list = new ArrayList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            int levelLen = queue.size();
            sum = 0;
            while (levelLen-- > 0) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            list.add(sum);
        }

        Collections.sort(list);
        
        return list.size() - k >= 0 ? list.get(list.size() - k) : -1;
    }
}