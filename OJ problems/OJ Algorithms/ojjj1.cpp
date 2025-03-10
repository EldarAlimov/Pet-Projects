class Solution {
public:
    void permuteHelper(const vector<int>& nums, vector<bool>& used, vector<int>& path,
                       vector<vector<int>>& result) {
        if (path.size() == nums.size()) {
            result.push_back(path);
            return;
        }

        for (int i = 0; i < nums.size(); ++i) {
            if (used[i]) continue;

            used[i] = true;
            path.push_back(nums[i]);
            permuteHelper(nums, used, path, result);
            path.pop_back();
            used[i] = false;
        }
    }

    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> result;
        vector<bool> used(nums.size(), false);
        vector<int> path;

        permuteHelper(nums, used, path, result);
        return result;
    }
};