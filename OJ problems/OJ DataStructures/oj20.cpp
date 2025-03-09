#include <iostream>
#include <vector>
#include <unordered_map>

std::vector<int> deleteNth(const std::vector<int>& elements, int maxOccurrences) {
    std::unordered_map<int, int> occurrences;
    std::vector<int> result;

    for (int element : elements) {
        int count = occurrences[element];
        if (count < maxOccurrences) {
            occurrences[element]++;
            result.push_back(element);
        }
    }

    return result;
}