// Last updated: 10/20/2025, 11:46:15 AM
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
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        
        while (head!= null) {
            list.add(head.val);
            head = head.next;
        }
        
        Collections.sort(list);
        
        head = new ListNode();
        ListNode temp = head;
        
        for (int x : list) {
            temp.next = new ListNode(x);
            temp = temp.next;
        }
        
        return head.next;
    }
}