#include <iostream>
#include <vector>
using namespace std;

int main(){

    int t;
    cin>>t;
    for (int i = 0; i < t; ++i) {
        int n;
        cin>>n;
        int ans = 0;
        vector<int> v(n);
        for (int j = 0; j < n; ++j) {
            cin>>v[j];
            if(j==0)
                continue;
            for (int k = j-1; k >= 0 ; k--) {
                if (v[k] <= v[j]) {
                    ans++;
                }
            }
        }
        cout<<ans<<endl;
    }

    return 0;
}