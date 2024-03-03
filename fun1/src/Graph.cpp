//
// Created by gignt on 19.02.2024.
//

#include "Graph.h"

Graph::Graph(vector<pair<string,vector<pair<string,double>>>> g){
    this ->graph = g;
    this ->numVertices = g.size();
}

Graph::Graph(vector<City> cities, int distance){
    vector<pair<string,vector<pair<string,double>>>> g;

    for (int i = 0; i < cities.size(); ++i) {
        vector<pair<string,double>> adj;
        for (int j = 0; j < cities.size(); ++j) {
            if(i==j) continue;
            double dis = cities[i].distance(cities[j]);
            if(dis > distance) continue;
            adj.push_back(make_pair(cities[j].getName(),dis));
        }
        g.push_back(make_pair(cities[i].getName(), adj));
    }
    this->graph = g;
    this->numVertices = g.size();
}

bool Graph::isExist(std::string cityName) const {
    for (int i = 0; i < this->graph.size(); ++i) {
        if(this->graph[i].first == cityName) return true;
    }
    return false;
}


bool Graph::isConnected(string cityName1, string cityName2) const{
    for (int i = 0; i < this->graph.size(); ++i) {
        if(this->graph[i].first == cityName1){
            for (int j = 0; j < this->graph[i].second.size(); ++j) {
                if(this->graph[i].second[j].first==cityName2) return true;
            }
        }
    }
    return false;
}
