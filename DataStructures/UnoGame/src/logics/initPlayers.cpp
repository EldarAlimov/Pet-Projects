//
// Created by gignt on 03.12.2023.
//
#include "../entities/Game.h"

void Game::initPlayers(){
    for(auto& player : players){
        for(int i = 0; i < 7; ++i){
            player.takeCard(deck.top());
            deck.pop();
        }
    }
    discardPile.push_back(deck.top());
    deck.pop();
}