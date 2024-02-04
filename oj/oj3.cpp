static bool isPerfect(TreeNode* root)
{
    if(root==NULL) return true;
    bool isL = root->left == nullptr,
            isR = root->right == nullptr;
    if(isL!=isR){
        return false;
    }
    if(isL && isR) return true;


    bool ans = isPerfect(root->left) && isPerfect(root->right);
    return ans;
}