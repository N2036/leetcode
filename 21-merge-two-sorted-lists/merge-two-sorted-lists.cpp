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
    ListNode* mergeTwoLists(ListNode* i, ListNode* j) {
        if (!i) {return j;}
        if (!j) {return i;}
        if (j->val < i->val) {swap(i, j);}
        ListNode* head = i;
        ListNode* prev = nullptr;
        while (i != nullptr && j != nullptr) {
            if (i->val <= j->val) {
                prev = i;
                i = i->next;
            } else {
                ListNode* nextJ = j->next;
                if (prev) {
                    prev->next = j;
                }
                j->next = i;
                prev = j;
                j = nextJ;
            }
        }
        if (j != nullptr) { prev->next = j;}
        return head;
    }
};