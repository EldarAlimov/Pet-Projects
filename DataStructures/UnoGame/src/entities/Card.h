//
// Created by gignt on 19.11.2023.
//

#ifndef BIGINTEGER_CARD_H
#define BIGINTEGER_CARD_H

#endif //BIGINTEGER_CARD_H
#include "../enums/CardColor.cpp"
#include "../enums/CardValue.cpp"
#include "../enums/CardColorDark.cpp"
#include "../enums/CardValueDark.cpp"

class Card{

private:
    CardColor color;
    CardColorDark colorDark;
    CardValue value;
    CardValueDark valueDark;
public:
    bool operator != (const Card& s) const;
    bool operator == (const Card& s) const;
    Card(CardColor color, CardValue value, CardColorDark colorDark, CardValueDark valueDark);
    CardColor getColor() const;
    CardValue getValue() const;
    CardColorDark getColorDark() const;
    CardValueDark getValueDark() const;

};
