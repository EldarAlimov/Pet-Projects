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
    map<string,int> in;
    for (int i = 0; i < cities.size(); ++i) {
        vector<pair<string,double>> adj;
        for (int j = 0; j < cities.size(); ++j) {
            if(i==j) continue;
            double dis = cities[i].distance(cities[j]);
            if(dis > distance) continue;
            adj.push_back(make_pair(cities[j].getName(),dis));
        }
        g.push_back(make_pair(cities[i].getName(), adj));
        in[cities[i].getName()] = i;
    }
    this->index = in;
    this->graph = g;
    this->numVertices = g.size();
}

bool Graph::isExist(const std::string cityName) const {
    if(index.find(cityName) != index.end()) return true;
    return false;
}


bool Graph::isConnected(const string cityName1, const string cityName2) const{
    vector<bool> visited(graph.size(), false);
    stack<string> stack;
    stack.push(cityName1);

    while (!stack.empty()) {
        string current = stack.top();
        stack.pop();

        if (current == cityName2) {
            return true;
        }

        int index = -1;
        for (int i = 0; i < graph.size(); ++i) {
            if (graph[i].first == current) {
                index = i;
                break;
            }
        }

        if (index == -1 || visited[index]) {
            continue;
        }

        visited[index] = true;

        for (const auto& neighbor : graph[index].second) {
            int neighborIndex = -1;
            for (int i = 0; i < graph.size(); ++i) {
                if (graph[i].first == neighbor.first) {
                    neighborIndex = i;
                    break;
                }
            }

            if (neighborIndex != -1 && !visited[neighborIndex]) {
                stack.push(neighbor.first);
            }
        }
    }

    return false;
}


