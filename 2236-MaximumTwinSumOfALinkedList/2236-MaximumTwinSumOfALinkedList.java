// Last updated: 10/20/2025, 11:36:28 AM
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
class Solution {
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int max = 0;

        int left = 0, right = list.size() - 1;
        while (left < right) {
            max = Math.max(list.get(left) + list.get(right), max);
            left++;
            right--;
        }
        return max;
    }
}