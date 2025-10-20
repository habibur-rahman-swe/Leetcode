// Last updated: 10/20/2025, 11:38:56 AM
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
    public int pseudoPalindromicPaths (TreeNode root) {
        if (root == null) return 0;
        int[] arr = new int[10];
        return getRes(root, arr);
    }
    private int getRes(TreeNode root, int[] arr) {
        int ans = 0;
        arr[root.val]++;

        if (root.left == null && root.right == null) {
            ans += numOfOdd(arr) <= 1 ? 1 : 0;
        }
        if (root.left != null) {
            ans += getRes(root.left, arr);
        }
        if (root.right != null) {
            ans += getRes(root.right, arr);
        }
        
        arr[root.val]--;
        return ans;
    }
    private int numOfOdd(int[] arr) {
        int odd = 0;
        for (int x : arr) {
            if ((x & 1) == 1) ++odd;
        }
        return odd;
    }
}