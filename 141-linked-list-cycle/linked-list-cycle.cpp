/*
//  Definition for singly-linked list.
struct ListNode {
    int val;
    ListNode* next;
    ListNode(int x) : val(x), next(NULL) {}
};
*/
class Solution {
public:
    bool hasCycle(ListNode* head) {
        ListNode* first = head;
        ListNode* last = head;

        while (last && last->next) {
            first= first->next;
            last = last->next->next;

            if (last == first)
                return true;
        }
        return false;
    }
};