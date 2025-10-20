// Last updated: 10/20/2025, 11:46:52 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        int cnt = 0;
        ListNode temp = head;
        while (temp != null) {
            ++cnt;
            temp = temp.next;
        }
        int[] arr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = head.val;
            head = head.next;
        }
        TreeNode root = createBST(0, cnt-1, arr);
        
        return root;
    }
    public TreeNode createBST(int start, int end, int[] arr) {
        if (start > end) return null;
        if (start == end) return new TreeNode(arr[start]);
        
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        
        root.left = createBST(start, mid-1, arr);
        root.right = createBST(mid+1, end, arr);
        
        return root;
    }
}