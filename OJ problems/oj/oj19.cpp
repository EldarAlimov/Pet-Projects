//
// Created by gignt on 10.05.2024.
//
#include <vector>
#include <cstdint>


std::vector<uint64_t> powers_of_two(int n) {
    std::vector<uint64_t> ans(n+1);
    ans[0] = 1;
    for (int i = 1; i <= n; ++i){
        ans[i] = ans[i-1] *2;
    }
    return ans;
}
