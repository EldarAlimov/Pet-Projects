#include <string>

using namespace std;


bool tidyNumber (int n)
{
    bool f = 1;
    string s = to_string(n);
    for(int i = 0; i< s.size()-1; i++){
        if(s[i]>s[i+1]){
            f = 0;
        }
    }
    return f;
}