#include <iostream>
#include <vector>

using namespace std;

void printByRule(string rule, vector<string> words, int pos, string s){
    if(pos == rule.size()){
        cout<<s<<endl;
        return;
    }
    string ns;
    if(rule[pos] == '0'){
        for (int i = 0; i < 10; i++) {
            ns = s+to_string(i);
            printByRule(rule, words, pos+1, ns);
        }
    }
    else{
        for (int i = 0; i < words.size(); i++){
            ns=s+words[i];
            printByRule(rule, words, pos+1, ns);
        }
    }
}



int main()
{
    int a;
    while(cin>>a){
        vector<string> words(a);
        for (int i = 0; i < a; i++) {
            cin>>words[i];
        }
        cout<<"--"<<endl;
        int b;
        cin>>b;
        string rule;
        for (int i = 0; i < b; i++) {
            cin>>rule;
            printByRule(rule, words, 0, "");
        }

    }

    return 0;
}