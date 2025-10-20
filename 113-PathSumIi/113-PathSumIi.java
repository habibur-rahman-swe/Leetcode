// Last updated: 10/20/2025, 11:46:48 AM
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		
		List<List<Integer>> res = new ArrayList<>();
		
		if (root == null) return res;
		
		getRes(root, targetSum, new ArrayList<Integer>(), res);
		
		return res;
    }
	
	public void getRes(TreeNode root, int sum, ArrayList<Integer> list, List<List<Integer>> res) {
		if (root == null) return;
		
		list.add(root.val);
		if (root.left == null && root.right == null && sum - root.val == 0) {
			res.add(list);
			list = new ArrayList<>();
			return;
		}
		
		if (root.left != null) getRes(root.left, sum - root.val, new ArrayList<>(list), res);
		if (root.right != null) getRes(root.right, sum - root.val, new ArrayList<>(list), res);
	}
}