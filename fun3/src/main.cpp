#include <iostream>
#include <nlohmann/json.hpp>
#include <vector>

using namespace std;

int finMax, resMax, ecoMax;

struct option{
    int fin; // cost
    int res; // resources_required
    int eco; // impact_score
    int capInc; // capacity_increase
};

void readCSV(int& finMax, int& resMax, int& ecoMax, vector<option>& option){

}

void printTable()

void readJson(int& finMax, int& resMax, int& ecoMax, vector<option>& option){

}






int main(){

    vector<option> options;

    readJson(finMax, resMax, ecoMax, options);

    int dp[options.size()][finMax][resMax][ecoMax];

    for(int i = 0; i < options.size(); i++){
        for(int j = 0; j <= finMax; j++){
            for (int k = 0; k < resMax; ++k) {
                for (int l = 0; l < ecoMax; ++l) {
                    dp[i][j][k][l] = max(
                    dp[i-1][j][k][l],
                    dp[i][j-options[i].fin][k-options[i].res][l-options[i].eco] + options[i].capInc);
                }
            }
        }
    }






    return 0;
}
