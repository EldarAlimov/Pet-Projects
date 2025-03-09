//
// Created by gignt on 23.11.2023.
//

#ifndef BIGINTEGER_PLAYER_H
#define BIGINTEGER_PLAYER_H
#include <string>
#include <vector>
#include "Card.h"

class Player {
private:
    std::string name;
    std::vector<Card> hand;

public:
    Player(const std::string& name);
    void takeCard(const Card& a);
    void playCard(int i);
    const std::vector<Card>& getHand() const;
    const std::string& getName() const;
};


#endif //BIGINTEGER_PLAYER_H
