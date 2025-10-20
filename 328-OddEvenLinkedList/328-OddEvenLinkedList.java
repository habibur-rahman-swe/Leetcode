// Last updated: 10/20/2025, 11:44:46 AM
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
    public ListNode oddEvenList(ListNode head) {
        ListNode even = new ListNode();
        ListNode tEven = even;
        ListNode odd = new ListNode();
        ListNode tOdd = odd;

        int cnt = 1;

        while (head != null) {
            if (cnt % 2 == 0) {
                tEven.next = new ListNode(head.val);
                tEven = tEven.next;
            } else {
                tOdd.next = new ListNode(head.val);
                tOdd = tOdd.next;
            }
            head = head.next;
            ++cnt;
        }
        tOdd.next = even.next;
        return odd.next;
    }
}