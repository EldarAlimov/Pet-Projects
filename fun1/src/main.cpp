#include <iostream>
#include "Graph.h"
#include "City.h"
#include <fstream>
#include <sstream>

using namespace std;

void checkConnect(Graph g){
    cout<<"Please, enter the origin city."<<endl;
    string city1;
    cin>>city1;
    cout<<"Please, enter the destination city."<<endl;
    string city2;
    cin>>city2;
    if(g.isConnected(city1, city2)){
        cout<<"There is a route between " + city1 + " and " + city2 + "."<<endl;
        return;
    }
    cout<<"There is no route between " + city1 + " and " + city2 + "."<<endl;
}


vector<vector<string>> readCSV(const string& filePath) {
    vector<vector<string>> result;
    ifstream file(filePath);
    string line;

    while (getline(file, line)) {
        vector<string> row;
        stringstream ss(line);
        string cell;
        for (int i = 0; i < 3; ++i) {
            if (getline(ss, cell, ',')) {
                row.push_back(cell);
            }
            else {
                row.emplace_back("");
            }
        }
        result.push_back(row);
    }
    return result;
}


void printActions(){
    cout<<"1. Check if a route between two cities exists."<<endl;
    cout<<"2. Create a route between two cities."<<endl;
    cout<<"3. Create a route map between all the cities."<<endl;
    cout<<"4. Browse the flight network."<<endl;
    cout<<"5. Play a game."<<endl;
    cout<<"6. Exit."<<endl;
}


int main()
{
    vector<vector<string>> input;
    vector<City> cities;
    input = readCSV("../files/kg.csv");
    cities.reserve(input.size());
    for (auto & i : input) {
        cities.emplace_back(i[0], stod(i[1]), stod(i[2]));
    }




    cout<<"Please, enter the maximum positive distance between a plane can fly (km): ";
    int maxDis;
    cin>>maxDis;

    Graph fullGraph(cities, maxDis);

    cout<<"Now, tell me what do you want to accomplish?"<<endl;
    printActions();
    int comNum;
    while(cin>>comNum){
        switch(comNum){
            case 1:
                checkConnect(fullGraph);
                break;
            default:
                cout<<"There is no such command"<<endl;
                printActions();
                break;
        }
    }


    return 0;
}