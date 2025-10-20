// Last updated: 10/20/2025, 11:47:20 AM
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
    public ListNode partition(ListNode head, int x) {
        ListNode head1 = new ListNode();
        ListNode head2 = new ListNode();

        ListNode temp1 = head1;
        ListNode temp2 = head2;

        while (head != null) {
            if (head.val < x) {
                temp1.next = new ListNode(head.val);
                temp1 = temp1.next;
            } else {
                temp2.next = new ListNode(head.val);
                temp2 = temp2.next;
            }
            head = head.next;
        }

        temp1.next = head2.next;
        return head1.next;
    }
}