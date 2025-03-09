#include <vector>
using namespace std;
typedef unsigned long ul;

vector<int> move_zeroes(const vector<int>& v) {
    ul s = 0;
    vector<int> v2;
    for(ul i = 0; i < v.size(); i++){
        if(v[i]==0){
            s++;
        }else{
            v2.push_back(v[i]);
        }
    }
    for(ul i = 0; i < s; i++){
        v2.push_back(0);
    }

    return v2;
}