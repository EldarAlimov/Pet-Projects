#include <iostream>
#include <nlohmann/json.hpp>
#include <vector>
#include <fstream>

using namespace std;

struct option{
    int fin; // cost
    int res; // resources_required
    int eco; // impact_score
    int capInc; // capacity_increase
};


 // top-down recursion
int r(int fm, int rm, int em, int s, vector<option>& options) {
    if (s == 1) return 0;
    int uns = 0;
    for (int i = 2; i <= s; ++i) {
        option op = options[i - 1];
        if (op.fin <= fm && op.res <= rm && op.eco <= em)
            uns = max(op.capInc + r(fm- op.fin, rm - op.res, em - op.eco, s - 1, options),
                      uns);
    }
    return uns;
}


int main(){

    vector<option> ops; // vector of input options
    ops.push_back({0, 0, 0, 0});


    ifstream ifs("../fun3/files/Data3.json");
    int finMax, resMax, ecoMax; // our budget

    auto json = nlohmann::json::parse(ifs);
    finMax = json["financial_budget"].template get<int>()/10; // divide by 10 to optimize array
    resMax = json["resource_budget"].template get<int>();
    ecoMax = json["ecological_budget"].template get<int>();
    for(auto op : json["options"]){
        ops.push_back({op["cost"].template get<int>()/10,
                          op["resources_required"].template get<int>(),
                          op["impact_score"].template get<int>(),
                          op["capacity_increase"].template get<int>()});
    }


    vector<vector<vector<vector<int>>>> dp(ops.size(),
            vector<vector<vector<int>>>(finMax+1,
                    vector<vector<int>>(resMax+1,
                            vector<int>(ecoMax+1, 0)))
    ); // main array

    // bottom-up cycle


    for(int i = 1; i < ops.size(); i++){
        for(int j = 1; j <= finMax; j++){
            for (int k = 1; k <= resMax; ++k) {
                for (int l = 1; l <= ecoMax; ++l) {
                    dp[i][j][k][l] = dp[i-1][j][k][l];
                    if(ops[i].fin <= j && ops[i].res <=k && ops[i].eco <=l){
                        dp[i][j][k][l] = max(                   // build main array (to use new option or not to use)
                        dp[i][j][k][l],                       // case we don't use new option
                        dp[i-1]                                   // case we do use new option
                        [j-ops[i].fin]     // index j for financial cost, prevent out of bounds
                        [k-ops[i].res]     // index k for resource budget
                        [l-ops[i].eco]     // l for ecological impact
                        + ops[i].capInc);
                    }
                                          // capacity increase due to usage of option
                }
            }
        }
    }

    cout<<"The maximum amount of new airplanes is: " +
            to_string(dp[ops.size()-1][finMax][resMax][ecoMax]) + "."<<endl;
    cout<<"The maximum amount of new airplanes is: " +
          to_string(r(finMax, resMax, ecoMax, ops.size(), ops)) + "."<<endl;

    return 0;
}
