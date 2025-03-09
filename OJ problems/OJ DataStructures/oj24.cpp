#include <string>
#include <unordered_set>

std::string duplicate_encoder(const std::string& word){
    std::unordered_set<char> uniqueChars;
    std::unordered_set<char> duplicateChars;
    std::string result;

    for (char ch : word) {
        char lowercaseCh = std::tolower(ch);

        if (uniqueChars.count(lowercaseCh) == 0) {
            uniqueChars.insert(lowercaseCh);
        } else {
            duplicateChars.insert(lowercaseCh);
        }
    }

    for (char ch : word) {
        char lowercaseCh = std::tolower(ch);
        result += (duplicateChars.count(lowercaseCh) > 0) ? ')' : '(';
    }

    return result;
}