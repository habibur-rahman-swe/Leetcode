// Last updated: 10/20/2025, 11:36:06 AM
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
    public ListNode mergeNodes(ListNode head) {
        ListNode newHead = new ListNode();
        ListNode temp = newHead;
        int sum = 0;
        head = head.next;
        while (head != null) {
            if (head.val == 0) {
                temp.next = new ListNode(sum);
                sum = 0;
                temp = temp.next;
            } else {
                sum += head.val;
            }
            
            head = head.next;
        }
        return newHead.next;
    }
}