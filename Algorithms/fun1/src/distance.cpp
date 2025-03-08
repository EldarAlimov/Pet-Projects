//
// Created by gignt on 19.02.2024.
//
#include "City.h"
#include <cmath>

const int R = 6371;   //Earth radius in km

int City::distance(City other) const {
     double dLat = (this->getLat() - other.getLat()) * M_PI / 180.0;
     double dLon = (this->getLon() - other.getLon()) * M_PI / 180.0;
     double a = pow(sin(dLat / 2), 2) +
                pow(sin(dLon / 2), 2) *
                cos(other.getLat() * M_PI/180.0) *
                cos(this->getLat() * M_PI/180.0);
     double c = 2 * asin(sqrt(a));
     return R * c;
}