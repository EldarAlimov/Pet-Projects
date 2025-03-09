#include <iostream>
#include <vector>
#include <queue>

int queueTime(std::vector<int> customers, int n) {
    std::vector<int> checkoutTills(n, 0);
    std::queue<int> queue;

    for (int customerTime : customers) {
        queue.push(customerTime);
    }
    while (!queue.empty()) {
        int minTime = checkoutTills[0];
        int minIndex = 0;
        for (int i = 1; i < n; ++i) {
            if (checkoutTills[i] < minTime) {
                minTime = checkoutTills[i];
                minIndex = i;
            }
        }
        checkoutTills[minIndex] += queue.front();
        queue.pop();
    }

    int totalTime = 0;
    for (int time : checkoutTills) {

        totalTime = std::max(totalTime, time);
    }
    return totalTime;
} 