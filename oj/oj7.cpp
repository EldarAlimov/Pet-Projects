/*
// Definition for a Node.
class Node {
public:s
    int val;
    vector<Node> children;

    Node() {}

    Node(int _val) {
        val = _val;
    }

    Node(int _val, vector<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
public:
    void dfs(Node root, vector<int> &v){
        v.push_back(root->val);
        if(root->children.size() == 0)return;
        for(int i = 0; i < root->children.size(); ++i){
            dfs(root->children[i], v);
        }
    }
    vector<int> preorder(Node* root) {
        vector<int> v;
        if(root==nullptr) return v;
        dfs(root, v);
        return v;
    }
};