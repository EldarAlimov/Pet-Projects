#include <iostream>
#include <nlohmann/json.hpp>
#include <vector>
#include <fstream>

using namespace std;

int finMax, resMax, ecoMax; // our budget

struct option{
    int fin; // cost
    int res; // resources_required
    int eco; // impact_score
    int capInc; // capacity_increase
};



void readJson( string& filename, vector<option>& option){
    ifstream ifs(filename);
    stringstream buffer;
    buffer << ifs.rdbuf();
    auto json = nlohmann::json::parse(buffer.str());
    finMax = json["financial budget"];
    resMax = json["resource budget"];
    ecoMax = json["ecological budget"];

}



void printTalbe(int **dp, )


 

int main(){

    vector<option> ops; // vector of input options
    ops.push_back({0, 0, 0, 0});
    readJson("../files/Data3.txt",finMax, resMax, ecoMax, ops);

    int dp[ops.size()][finMax][resMax][ecoMax]; // main array

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
