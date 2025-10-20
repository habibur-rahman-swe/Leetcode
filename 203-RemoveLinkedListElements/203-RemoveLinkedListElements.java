// Last updated: 10/20/2025, 11:45:39 AM
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev, pres;

        while (head != null && head.val == val) head = head.next;
        
        pres = head;
        prev = pres;
        while (pres != null) {
            if (pres.val == val) {
                prev.next = pres.next;
                pres = prev.next;
            } else {
                prev = pres;
                pres = pres.next;
            }
        }
        
        return head;
    }
}