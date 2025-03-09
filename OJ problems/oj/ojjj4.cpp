#include <iostream>
#include <string>

using namespace std;

void rec(string& s, int sLevel, int i, int h){
    if(sLevel == h){
        cout << s << endl;
        return;
    }
    if(i >= s.length()){
        return;
    }
    rec(s, sLevel, i + 1, h);
    s[i] = '1';
    rec(s, sLevel + 1, i + 1, h);

    s[i] = '0';
}

int main()
{
    int n;
    cin >> n;

    while(n--){
        int stringLength, h;
        cin >> stringLength >> h;
        string sString(stringLength, '0');
        rec(sString, 0, 0, h);

        if(n > 0){
            cout << endl;
        }
    }

    return 0;
}