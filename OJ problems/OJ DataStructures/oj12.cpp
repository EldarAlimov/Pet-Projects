#include <string>
#include <vector>
using namespace std;

string format_duration(int s) {
    int m = 0;
    int h = 0;
    int d, y;
    vector<string> ans;
    string ans1 = "";
    if(s == 0){
        return "now";
    }
    m = s/60;
    s = s%60;
    h = m/60;
    m = m%60;
    d = h/24;
    h = h%24;
    y = d/365;
    d = d%365;

    if(y > 1){
        ans.push_back(to_string(y)+" years");
    }else if(y == 1){
        ans.push_back(to_string(y)+" year");
    }

    if(d > 1){
        ans.push_back(to_string(d)+" days");
    }else if(d == 1){
        ans.push_back(to_string(d)+" day");
    }
    if(h > 1){
        ans.push_back(to_string(h)+" hours");
    }else if(h == 1){
        ans.push_back(to_string(h)+" hour");
    }
    if(m > 1){
        ans.push_back(to_string(m)+" minutes");
    }else if(m == 1){
        ans.push_back(to_string(m)+" minute");
    }
    if(s > 1){
        ans.push_back(to_string(s)+" seconds");
    }else if(s == 1){
        ans.push_back(to_string(s)+" second");
    }
    if(ans.size() == 1){
        return ans[0];
    }
    for(int i = 0; i<ans.size() ; i++){
        if(i == ans.size() -2){
            ans1+=ans[i]+" and "+ans[i+1];
            return ans1;
        }else{
            ans1+=ans[i]+", ";
        }
    }



}