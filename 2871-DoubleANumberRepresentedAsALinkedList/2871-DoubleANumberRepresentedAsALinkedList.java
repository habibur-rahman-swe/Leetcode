// Last updated: 10/20/2025, 11:33:15 AM
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
    public ListNode doubleIt(ListNode head) {
        int x = carry(head);
        if (x > 0) {
            ListNode temp = new ListNode(x);
            temp.next = head;
            return temp;
        }
        return head;
    }
    private int carry(ListNode head) {
        if (head == null) {
            return 0;
        }
        int sum = 2 * head.val + carry(head.next);
        head.val = sum % 10;
        return sum / 10;
    }
}