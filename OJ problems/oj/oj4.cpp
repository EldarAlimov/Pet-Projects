#include <iostream>
#include <vector>

using namespace std;

long long determinant(vector< vector<long long> > m) {
    if(m.size() == 1){
        return m[0][0];
    }
    if(m.size() == 2){
        return m[0][0]m[1][1] - m[0][1]m[1][0];
    }
    long long ans = 0;
    int sign = 1;
    for(int i = 0; i < m.size(); ++i){
        vector<vector<long long>> s;
        for(int j = 1; j < m.size(); ++j){
            vector<long long> ss;
            for(int k = 0; k < m.size(); ++k){
                if(k == i){
                    continue;
                }
                ss.push_back(m[j][k]);
            }
            s.push_back(ss);
        }
        ans+= determinant(s)* m[0][i]sign;
        sign=-1;
    }
    return ans;
}