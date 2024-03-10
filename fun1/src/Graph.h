//
// Created by gignt on 19.02.2024.
//

#ifndef ALGORITHMS_PERSONAL_REPO_ALIMOV_E_AUCA_2022_STUFF_GRAPH_H
#define ALGORITHMS_PERSONAL_REPO_ALIMOV_E_AUCA_2022_STUFF_GRAPH_H

#include <map>
#include <unordered_map>
#include <stack>
#include <vector>
#include "City.h"
#include <utility>
using namespace std;

class Graph {
private:
    vector<pair<string, vector<pair<string,double>>>> graph;
    map<string, int> index;
    int numVertices;
public:
    Graph(vector<pair<string,vector<pair<string,double>>>> graph);
    Graph(vector<City> cities, int distance);
    bool isConnected (string cityName1, string cityName2) const;
    bool isExist (string cityName) const;
    vector<string> shortestRoute(string cityName1, string cityName2);
    void dfs(string src, vector<bool>& visited);
    bool isGraphConnected() const;

    Graph MST(Graph g);
};


#endif //ALGORITHMS_PERSONAL_REPO_ALIMOV_E_AUCA_2022_STUFF_GRAPH_H
