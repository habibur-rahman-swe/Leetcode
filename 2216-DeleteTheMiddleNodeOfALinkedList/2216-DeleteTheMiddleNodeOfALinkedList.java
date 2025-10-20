// Last updated: 10/20/2025, 11:36:32 AM
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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;
        
        ListNode t1 = head;
        ListNode t1Prev = null;
        ListNode t2 = head;

        while (t2 != null) {
            if (t2.next == null) {
                t1Prev.next = t1.next;
                break;
            }

            if (t2.next.next == null) {
                t1.next = t1.next.next;
                break;
            }
            t1Prev = t1;
            t1 = t1.next;
            t2 = t2.next.next;
        }
        return head;
    }
}