//
// Created by gignt on 10.05.2024.
//
#include <string>

std::string rps(const std::string& p1, const std::string& p2)
{
    if(p1 == p2) return "Draw!";

    return (p1[0] == 'r' && p2[0] == 'p') ||
           (p1[0] == 'p' && p2[0] == 's') ||
           (p1[0] == 's' && p2[0] == 'r') ? "Player 2 won!" : "Player 1 won!";
}