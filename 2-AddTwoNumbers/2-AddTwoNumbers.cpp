// Last updated: 10/20/2025, 11:49:17 AM
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* head = NULL;
        ListNode* temp1 = l1;
        ListNode* temp2 = l2;
        int carry = 0;
        while(1) { 
            if(temp1 != NULL) {
                carry += temp1->val;
                temp1 = temp1->next;
            }
            if (temp2 != NULL) {
                carry += temp2->val;
                temp2 = temp2->next;
            }
            ListNode* newNode = createNode(carry % 10);
            carry = carry / 10;
            if (head == NULL) head = newNode;
            else {
                ListNode* temp = head;
                while(temp->next != NULL) temp = temp->next;
                temp->next = newNode;
            }
            if (carry == 0 && temp1 == NULL && temp2 == NULL) break;
        }
        return head;
    }
    ListNode* createNode(int item) {
        ListNode* newNode = new ListNode;
        newNode->val = item;
        newNode->next = NULL;
        return newNode;
    }
};