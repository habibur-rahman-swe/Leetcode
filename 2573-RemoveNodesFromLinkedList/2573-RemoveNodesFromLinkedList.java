// Last updated: 10/20/2025, 11:34:57 AM
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
    public ListNode removeNodes(ListNode head) {
        if (head == null) return head;
        
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        
        ListNode newHead = null;
        
        while (!stack.isEmpty()) {
            if (newHead == null) {
                newHead = new ListNode(stack.peek());
            }
            else if (stack.peek() >= newHead.val) {
                ListNode new_node = new ListNode(stack.peek());
                new_node.next = newHead;
                newHead = new_node;
            }
            stack.pop();
        }
        return newHead;
    }
}