// Last updated: 10/20/2025, 11:47:52 AM
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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;
        if (k == 0) return head;
        List<Integer> list = new ArrayList<>();
        
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        ListNode newHead = new ListNode();
        ListNode temp = newHead;
        k %= list.size();
        for (int i = 0; i < list.size(); i++) {
            temp.next = new ListNode(list.get((i - k + 2 * list.size()) % list.size()));
            temp = temp.next;
        }
        return newHead.next;
    }
}