//
// Created by gignt on 10.05.2024.
//
using namespace std;

string replace(const string &s)
{
    string ans = s;
    string vowels = "aeiouAEIOU";
    for(int i = 0; i < ans.size(); ++i){
        for(int j = 0; j < vowels.size(); ++j){
            if(ans[i] == vowels[j]){
                ans[i] = '!';
            }
        }
    }
    return ans; //coding and coding....
}