//
// Created by gignt on 03.12.2023.
//

#include "../entities/Game.h"
#include <utility>
#include <algorithm>
#include <random>

void Game::initDeck(){
    std::vector<std::pair<CardColor, CardValue>> tempDeck;
    std::vector<std::pair<CardColorDark, CardValueDark>> tempDeckDark;

    for (int color = 0; color < 4; ++color) {
        for (int number = 1; number <= 9; ++number) {
            tempDeck.push_back(std::make_pair(static_cast<CardColor>(color), static_cast<CardValue>(number)));
            tempDeck.push_back(std::make_pair(static_cast<CardColor>(color), static_cast<CardValue>(number)));
        }
        tempDeck.push_back(std::make_pair(static_cast<CardColor>(color), static_cast<CardValue>(0)));

        for (int special = 0; special < 2; ++special) {
            tempDeck.push_back(std::make_pair(static_cast<CardColor>(color), Skip));
            tempDeck.push_back(std::make_pair(static_cast<CardColor>(color), DrawTwo));
            tempDeck.push_back(std::make_pair(static_cast<CardColor>(color), Reverse));
            tempDeck.push_back(std::make_pair(static_cast<CardColor>(color), Flip));
        }
    }
    for (int i = 0; i < 4; ++i){
        tempDeck.push_back(std::make_pair(CardColor::Wild,static_cast<CardValue>(13)));
        tempDeck.push_back(std::make_pair(CardColor::Wild,CardValue::WildDrawFour));
    }



    for (int color = 0; color < 4; ++color) {
        for (int number = 1; number <= 9; ++number) {
            tempDeckDark.push_back(std::make_pair(static_cast<CardColorDark>(color), static_cast<CardValueDark>(number)));
            tempDeckDark.push_back(std::make_pair(static_cast<CardColorDark>(color), static_cast<CardValueDark>(number)));
        }
        tempDeckDark.push_back(std::make_pair(static_cast<CardColorDark>(color), static_cast<CardValueDark>(0)));

        for (int special = 0; special < 2; ++special) {
            tempDeckDark.push_back(std::make_pair(static_cast<CardColorDark>(color), SkipEveryone));
            tempDeckDark.push_back(std::make_pair(static_cast<CardColorDark>(color), DrawFive));
            tempDeckDark.push_back(std::make_pair(static_cast<CardColorDark>(color), static_cast<CardValueDark>(12)));//Reverse = 12
            tempDeckDark.push_back(std::make_pair(static_cast<CardColorDark>(color), static_cast<CardValueDark>(15)));// Flip = 15
        }
    }
    for (int i = 0; i < 4; ++i){
        tempDeckDark.push_back(std::make_pair(static_cast<CardColorDark>(4),static_cast<CardValueDark>(13)));
        tempDeckDark.push_back(std::make_pair(static_cast<CardColorDark>(4), CardValueDark::WildDrawColor));
    }




    auto rng = std::default_random_engine {};
    std::shuffle(std::begin(tempDeck), std::end(tempDeck), rng);
    std::shuffle(std::begin(tempDeckDark), std::end(tempDeckDark), rng);

    for(int i = 0; i<tempDeck.size(); ++i){
        deck.push(Card(tempDeck[i].first, tempDeck[i].second,
                       tempDeckDark[i].first, tempDeckDark[i].second));
    }

}
