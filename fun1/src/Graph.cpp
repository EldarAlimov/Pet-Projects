//
// Created by gignt on 19.02.2024.
//

#include <algorithm>
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


vector<string> Graph::shortestRoute(string cityName1, string cityName2){
    vector<string> path;
    if(!isConnected(cityName1, cityName2)) return path;

    vector<int> dist(numVertices,INT_MAX);
    vector<string> prev(numVertices, "");
    vector<bool> visited(numVertices, false);
    dist[index[cityName1]] = 0;

    for (int i = 0; i < numVertices; ++i) {
        int u = -1;
        int minDist = INT_MAX;
        for (int j = 0; j < numVertices; ++j) {
            if (!visited[j] && dist[j] < minDist) {
                minDist = dist[j];
                u = j;
            }
        }
        if (u == -1) break;
        visited[u] = true;
        for (const auto& neighbor : graph[u].second) {
            int vIndex = -1;
            for (int j = 0; j < graph.size(); ++j) {
                if (graph[j].first == neighbor.first) {
                    vIndex = j;
                    break;
                }
            }
            if (vIndex != -1 && !visited[vIndex] && dist[u] + neighbor.second < dist[vIndex]) {
                dist[vIndex] = dist[u] + neighbor.second;
                prev[vIndex] = graph[u].first;
            }
        }
    }

    for(string s = cityName2; s != cityName1; s = prev[index[s]]){
        path.push_back(s);
    }
    reverse(path.begin(), path.end());
    return path;


}
