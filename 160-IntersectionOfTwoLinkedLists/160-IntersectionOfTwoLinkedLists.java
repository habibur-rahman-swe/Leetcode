// Last updated: 10/20/2025, 11:46:07 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode slow = headA;
        ListNode fast = headB;
        
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
            
            if (slow == fast) return slow;
            if (slow == null) slow = headA;
            if (fast == null) fast = headB; 
        }
        
        return slow;
    }
}