//
// Created by gignt on 19.11.2023.
//
#include "Card.h"
Card::Card(CardColor color, CardValue value, CardColorDark colorDark, CardValueDark valueDark) : color(color), value(value),
colorDark(colorDark), valueDark(valueDark){}

CardColor Card::getColor() const{
    return this->color;
}

CardColorDark Card::getColorDark() const{
    return this->colorDark;
}

CardValue Card::getValue() const {
    return this->value;
}
CardValueDark Card::getValueDark() const {
    return this->valueDark;
}
bool Card::operator == (const Card& s) const { return color == s.color && value == s.value; }
bool Card::operator != (const Card& s) const { return !operator==(s); }