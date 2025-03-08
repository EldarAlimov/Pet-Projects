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
    void dfs(TreeNode* root, vector<string> &v, string s){
        if (root==nullptr) {
            return;
        }

        if(root->left==nullptr && root->right==nullptr) {
            s += "->" + to_string(root->val);
            v.push_back(s);
            return;
        }

        string ns = s + "->" + to_string(root->val);
        if(root->left!=nullptr){
            dfs(root->left, v, ns);
        }
        if(root->right!=nullptr)dfs(root->right, v, ns);
        return;

    }
    vector<string> binaryTreePaths(TreeNode* root) {

        vector<string> v;
        if(root==nullptr) return v;
        string s = to_string(root->val);
        if(root->left == nullptr && root->right == nullptr){
            v.push_back(s);
            return v;
        }
        dfs(root->left, v, s);
        s = to_string(root->val);
        dfs(root->right, v, s);
        return v;

    }
};