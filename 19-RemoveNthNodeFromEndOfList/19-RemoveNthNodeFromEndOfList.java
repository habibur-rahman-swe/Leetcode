// Last updated: 10/20/2025, 11:48:51 AM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        TreeMap<Integer, ListNode> tm = new TreeMap<>();
        int idx = 1;
        while (head != null) {
            tm.put(idx, head);
            idx++;
            head = head.next;
        }
        
        if (tm.containsKey(n)) tm.remove(idx - n);
        
        ListNode temp = new ListNode();
        ListNode tHead = temp;
        
        for (int x : tm.keySet()) {
            tHead.next = new ListNode(tm.get(x).val);
            tHead = tHead.next;
        }
        return temp.next;
    }
}