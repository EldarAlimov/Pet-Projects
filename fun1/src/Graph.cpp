//
// Created by gignt on 19.02.2024.
//

#include <algorithm>
#include "Graph.h"

Graph::Graph(vector<pair<string,vector<pair<string,int>>>> g){
    this ->graph = g;
    this ->numVertices = g.size();
}

Graph::Graph(vector<City> cities, int distance){
    vector<pair<string,vector<pair<string,int>>>> g;
    map<string,int> in;
    for (int i = 0; i < cities.size(); ++i) {
        vector<pair<string,int>> adj;
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


void Graph::createRoute(string cityName1, string cityName2, int dis) {
    this->graph[index[cityName1]].second.push_back({cityName2, dis});
    this->graph[index[cityName2]].second.push_back({cityName1, dis});
}


vector<string> Graph::shortestRoute(string cityName1, string cityName2) {
    vector<string> path;
    if (!isConnected(cityName1, cityName2)) return path;

    vector<int> dist(numVertices, INT_MAX);
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
        for (const auto &neighbor: graph[u].second) {
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

    for (string s = cityName2; s != cityName1; s = prev[index[s]]) {
        path.push_back(s);
    }
    reverse(path.begin(), path.end());
    return path;
}

void Graph::dfs(std::string src, vector<bool> &visited) {
    visited[index[src]] = true;
    for(const auto& neighbor : graph[index[src]].second){
        if(!visited[index[neighbor.first]]){
            dfs(neighbor.first, visited);
        }
    }
}

bool Graph::isGraphConnected() {
    vector<bool> visited(numVertices, false);
    dfs(graph[0].first, visited);

    for(bool v : visited){
        if(!v) {
            return false;
        }
    }
    return true;
}

Graph Graph::MST() {
    int n = numVertices;
    vector<bool> visited(n, false);
    vector<int> minWeight(n, INT_MAX);
    vector<string> parent(n, "");

    string startVertex = graph[0].first;
    visited[0] = true;

    for (const auto& neighbor : graph[0].second) {
        int neighborIdx = index[neighbor.first];
        minWeight[neighborIdx] = neighbor.second;
        parent[neighborIdx] = startVertex;
    }

    vector<pair<string, vector<pair<string, int>>>> mst;
    mst.emplace_back(startVertex, vector<pair<string, int>>());

    for (size_t i = 1; i < n; ++i) {
        int minWeightIdx = -1;
        for (size_t j = 0; j < minWeight.size(); ++j) {
            if (!visited[j] && (minWeightIdx == -1 || minWeight[j] < minWeight[minWeightIdx])) {
                minWeightIdx = j;
            }
        }

        string u = parent[minWeightIdx];
        string v = graph[minWeightIdx].first;
        int weight = minWeight[minWeightIdx];

        mst.back().second.emplace_back(v, weight);
        visited[minWeightIdx] = true;

        for (const auto& neighbor : graph[minWeightIdx].second) {
            int neighborIdx = index[neighbor.first];
            if (!visited[neighborIdx] && neighbor.second < minWeight[neighborIdx]) {
                minWeight[neighborIdx] = neighbor.second;
                parent[neighborIdx] = v;
            }
        }
    }

    return mst;
}

