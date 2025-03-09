//
// Created by gignt on 10.05.2024.
//
#include <vector>

using namespace std;

int count_sheep(vector<bool> arr)
{
    int ans = 0;
    for(int i = 0; i < arr.size(); ++i){
        if(arr[i]) ans++;
    }
    return ans;
}
