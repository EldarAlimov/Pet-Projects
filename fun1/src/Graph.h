//
// Created by gignt on 19.02.2024.
//

#ifndef ALGORITHMS_PERSONAL_REPO_ALIMOV_E_AUCA_2022_STUFF_GRAPH_H
#define ALGORITHMS_PERSONAL_REPO_ALIMOV_E_AUCA_2022_STUFF_GRAPH_H

#include <map>
#include <vector>
#include "City.h"
#include <utility>
using namespace std;

class Graph {
private:
    map<string, vector<pair<string,double>>> graph;
    int numVertices;
public:
    Graph(map<string,vector<pair<string,double>>> graph);
    Graph(vector<City> cities, int distance);
};


#endif //ALGORITHMS_PERSONAL_REPO_ALIMOV_E_AUCA_2022_STUFF_GRAPH_H
