//
// Created by gignt on 23.11.2023.
//

#include "Player.h"
Player::Player(const std::string& name): name(name){};

void Player::takeCard(const Card& a){
    hand.push_back(a);
}
void Player::playCard(int i){
    if (i >=0 && i < static_cast<int>(hand.size())){
        hand.erase(hand.begin()+i);
    }
}
const std::vector<Card>& Player::getHand() const{
    return hand;
}
const std::string& Player::getName() const{
    return name;
}