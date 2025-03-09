#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main(){
    int t;
    cin>>t;
    cin.ignore();
    vector<string> ans(t);
    for (int i = 0; i < t; ++i) {
        string s;
        getline(cin, s);
        int p = 0;
        for (int j = 0; j < s.size(); ++j) {
            if(s[j] == '<'){
                if(p==0){
                    p++;
                    continue;
                }
                else{
                    p--;
                    ans[i].erase(p, 1);
                    continue;
                }
            }
            if(s[j] == '['){
                p = 0;
                continue;
            }
            if(s[j] == ']'){
                p = ans[i].size();
                continue;
            }

            ans[i].insert(ans[i].begin()+p, s[j]);
            p++;

        }
    }

    for (int i = 0; i < t; ++i) {
        cout<<ans[i]<<endl;
    }

    return 0;
}
