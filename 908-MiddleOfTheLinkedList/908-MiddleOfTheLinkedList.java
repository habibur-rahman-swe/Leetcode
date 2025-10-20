// Last updated: 10/20/2025, 11:41:44 AM
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
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while (slow.next != null && fast.next != null && fast.next.next != null) {
            if (slow.next != null) {
                slow = slow.next;
            }
            if (fast.next.next != null) {
                fast = fast.next.next;  
            }
        }
        if (fast != null && fast.next != null) slow = slow.next;
        
        return slow;
    }
}