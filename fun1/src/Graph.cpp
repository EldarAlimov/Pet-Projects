//
// Created by gignt on 19.02.2024.
//

#include "Graph.h"

Graph::Graph(map<string,vector<pair<string,double>>> g){
    this ->graph = g;
    this ->numVertices = g.size();
}

Graph::Graph(vector<City> cities, int distance){
    map<string,vector<pair<string,double>>> g;

    for (int i = 0; i < cities.size(); ++i) {
        vector<pair<string,double>> adj;
        for (int j = 0; j < cities.size(); ++j) {
            if(i==j) continue;
            double dis = cities[i].distance(cities[j]);
            if(dis > distance) continue;
            adj.push_back(make_pair(cities[j].getName(),dis));
        }
        g[cities[i].getName()] = adj;
    }
    this->graph = g;
    this->numVertices = g.size();
}
