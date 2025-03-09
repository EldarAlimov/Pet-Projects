#include<string>
#include<map>
using namespace std;

bool scramble(const string& s1, const string& s2){
    map<char, int> m1;
    for(int i = 0; i<s1.size(); i++){
        m1[s1[i]]++;
    }
    for(int i = 0; i<s2.size(); i++){
        if(m1[s2[i]] > 0){
            m1[s2[i]]--;
        }else{
            return false;
        }
    }
    return true;
}