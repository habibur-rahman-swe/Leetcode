// Last updated: 10/20/2025, 11:46:51 AM
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return makeBST(nums, 0, nums.length-1);
    }
    
    public TreeNode makeBST(int nums[], int p, int q) {
        if(p>q) return null;
        int m = (p+q)/2;
        return new TreeNode(nums[m], makeBST(nums, p, m-1), makeBST(nums, m+1, q));
    }
}