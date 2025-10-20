// Last updated: 10/20/2025, 11:43:02 AM
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        
        if (root == null) return res;
        
        double sum = 0;
        int cnt = 0;
        
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> tQueue = new LinkedList<>();
        
        queue.add(root);
        
        while (queue.size() > 0) {
            tQueue = new LinkedList<>();
            sum = 0;
            cnt = 0;
            while (queue.size() > 0) {
                sum += queue.peek().val;
                ++cnt;
                if (queue.peek().left != null) {
                    tQueue.add(queue.peek().left);
                } 
                if (queue.peek().right != null) {
                    tQueue.add(queue.peek().right);
                }
                queue.poll();
            }
            res.add(sum/cnt);
            queue = new LinkedList<>(tQueue);
        }
        
        return res;
    }
}