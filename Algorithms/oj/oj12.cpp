class Solution {
public:
    int rob(vector<int>& nums) {
        if(nums.size() == 0) return 0;
        if(nums.size() == 1) return nums[0];
        vector<int> ans(nums.size());
        ans[0] = nums[0];
        ans[1] = nums[0];
        if(nums[1] > ans[1]) ans[1] = nums[1];

        for(int i = 2; i < nums.size(); ++i){
            if(ans[i-1] >= ans[i-2] + nums[i]){
                ans[i] = ans[i-1];
            }
            else{
                ans[i] = ans[i-2] + nums[i];
            }
        }
        return ans[ans.size()-1];
    }
};