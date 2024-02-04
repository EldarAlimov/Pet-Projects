/**

Definition for a binary tree node.
struct TreeNode {
int val;
TreeNode *left;
TreeNode *right;
TreeNode() : val(0), left(nullptr), right(nullptr) {}
TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
TreeNode(int x, TreeNode left, TreeNoderight) : val(x), left(left), right(right) {}
};
*/
class Solution {
public:
    TreeNode* constructBST(vector<int>num,int start,int end){
        if(start>end)
            return NULL;
        int mid=(start+end)/2;
        TreeNode* root=new TreeNode(num[mid]);
        root->left=constructBST(num,start,mid-1);
        root->right=constructBST(num,mid+1,end);
        return root;

    }

    TreeNode* sortedArrayToBST(vector<int>& nums) {
        int n=nums.size();
        if(n==0)
            return NULL;
        int start=0;
        int end=n-1;
        return constructBST(nums,start,end);
    }
};