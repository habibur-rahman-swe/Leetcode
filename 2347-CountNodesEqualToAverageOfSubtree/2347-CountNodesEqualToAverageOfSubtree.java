// Last updated: 10/20/2025, 11:35:58 AM
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
    int ans = 0;
    public int averageOfSubtree(TreeNode root) {
        HashMap<TreeNode, Integer> hm = new HashMap<>();
        
        fillSum(hm, root);

        return ans;
    }

    private  int fillSum(HashMap<TreeNode, Integer> hm, TreeNode root) {
        int cnt = 1;
        hm.put(root, root.val);

        if (root.left != null) {
            cnt += fillSum(hm, root.left);
            hm.put(root, hm.get(root) + hm.get(root.left));
        }

        if (root.right != null) {
            cnt += fillSum(hm, root.right);
            hm.put(root, hm.get(root) + hm.get(root.right));
        }

        if (hm.get(root) / cnt == root.val) ++ans;

        return cnt;
    }
}