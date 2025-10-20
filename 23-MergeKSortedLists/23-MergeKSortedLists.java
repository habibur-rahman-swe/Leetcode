// Last updated: 10/20/2025, 11:48:45 AM
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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode();
        ListNode temp = head;

        PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b)->(a.val - b.val));

        for (ListNode list : lists) {
            if (list != null) queue.add(list);
        }

        while (!queue.isEmpty()) {
            ListNode list = queue.poll();
            temp.next = new ListNode(list.val);
            list = list.next;
            temp = temp.next;
            if (list == null) continue;
            queue.add(list);
        }

        return head.next;
    }
}