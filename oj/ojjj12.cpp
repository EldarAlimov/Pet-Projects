#include <string>
std::string solution(int num){
    std::map<int, std::string> roman_numerals = {
            {1, "I"}, {4, "IV"}, {5, "V"}, {9, "IX"}, {10, "X"}, {40, "XL"},
            {50, "L"}, {90, "XC"}, {100, "C"}, {400, "CD"}, {500, "D"}, {900, "CM"},
            {1000, "M"}
    };
    std::string result = "";
    for (auto rit = roman_numerals.rbegin(); rit != roman_numerals.rend(); ++rit) {
        while (num >= rit->first) {
            result += rit->second;
            num -= rit->first;
        }
    }
    return result;
}