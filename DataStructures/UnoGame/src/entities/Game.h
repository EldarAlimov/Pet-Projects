//
// Created by gignt on 01.12.2023.
//

#ifndef BIGINTEGER_GAME_H
#define BIGINTEGER_GAME_H

#include <stack>
#include "Player.h"
#include <algorithm>
#include <random>


class Game {
private:
    std::stack<Card> deck;
    std::vector<Player> players;
    std::vector<Card> discardPile;
    bool siFlip;

    void initDeck();
    void initPlayers();
    void shuffleDeck();
    void displayGameState() const;
public:

    Game(int numPlayers);
    void startGame();


};


#endif //BIGINTEGER_GAME_H
