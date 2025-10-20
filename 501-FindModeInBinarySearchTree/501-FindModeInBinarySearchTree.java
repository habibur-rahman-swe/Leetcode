// Last updated: 10/20/2025, 11:43:52 AM
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
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> counter = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();

            counter.put(node.val, counter.getOrDefault(node.val, 0) + 1);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        
        Integer maxValue = counter.values().stream().max(Integer::compareTo).get();
        List<Integer> keys = counter.keySet().stream().filter(key ->  counter.get(key) == maxValue).collect(Collectors.toList());
        int[] array = keys.stream().mapToInt(Integer::intValue).toArray();

        return array;
    }
}