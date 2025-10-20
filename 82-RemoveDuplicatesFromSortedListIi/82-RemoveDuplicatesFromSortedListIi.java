// Last updated: 10/20/2025, 11:47:24 AM
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans = new ListNode();
        ListNode tAns = ans;
        int cnt = 0;
        
        while (head != null) {
            cnt = 0;
            
            while (head.next != null && head.val == head.next.val) {
                ++cnt;
                head = head.next;
            }
            
            if (cnt == 0) {
                tAns.next = new ListNode(head.val);
                tAns = tAns.next;
            }
            head = head.next;
        }
        
        return ans.next;
    }
}