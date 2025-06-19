/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool preorder(TreeNode* root,long lower,long upper){
        if(root==NULL)return 1;
        if(root->val<=lower or root->val>=upper)return 0;
        return preorder(root->left,lower,root->val)&&
               preorder(root->right,root->val,upper);
    }
    bool isValidBST(TreeNode* root) {  
        return preorder(root,LONG_MIN,LONG_MAX);
    }
};