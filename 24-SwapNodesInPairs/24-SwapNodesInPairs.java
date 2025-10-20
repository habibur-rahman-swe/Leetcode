// Last updated: 10/20/2025, 11:48:44 AM
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
    public ListNode swapPairs(ListNode head) {
        ListNode tempHead = new ListNode();
        ListNode temp = tempHead;
        
        while (head != null) {
            if (head.next == null) {
                temp.next = new ListNode(head.val);
                head = head.next;
                temp = temp.next;
            } else {
                temp.next = new ListNode(head.next.val);
                temp = temp.next;
                temp.next = new ListNode(head.val);
                temp = temp.next;
                head = head.next.next;
            }
        }
        return tempHead.next;
    }
}