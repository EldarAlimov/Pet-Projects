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



}



void printTalbe(int **dp, )


 

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
        for(int j = 0; j <= finMax; j++){
            for (int k = 0; k < resMax; ++k) {
                for (int l = 0; l < ecoMax; ++l) {
                    dp[i][j][k][l] = max(                   // build main array (to use new option or not to use)
                    dp[i-1][j][k][l],                       // case we don't use new option
                    dp[i]                                   // case we do use new option
                    [ops[i].fin < j ? j-ops[i].fin : 0]     // index j for financial cost, prevent out of bounds
                    [ops[i].res < k ? k-ops[i].res : 0]     // index k for resource budget
                    [ops[i].eco < l ? l-ops[i].eco : 0]     // l for ecological impact
                    + ops[i].capInc);                       // capacity increase due to usage of option
                }
            }
        }
    }
    cout<<"The maximum amount of new airplanes is: " +
            to_string(dp[ops.size()-1][finMax-1][resMax-1][ecoMax-1]) + "."<<endl;

    while(cin)

    return 0;
}
