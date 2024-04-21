#include <iostream>
#include <string>

using namespace std;

int solution(string r) {
    int ans = 0;
    map<char, int> m;
    m['I'] = 1;
    m['V'] = 5;
    m['X'] = 10;
    m['L'] = 50;
    m['C'] = 100;
    m['D'] = 500;
    m['M'] = 1000;

    for(int i = 0; i < r.size(); ++i){
        if(i == r.size()-1){
            ans+=m[r[i]];
            continue;
        }
        if(m[r[i]] < m[r[i+1]]) {
            ans+=m[r[i+1]] - m[r[i]];
            i++;
            continue;
        }
        else{
            ans+=m[r[i]];
        }
    }
    return ans;
}