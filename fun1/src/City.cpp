//
// Created by gignt on 15.02.2024.
//

#include "City.h"
City::City(string name, double lat, double lon) : name(name), lat(lat), lon(lon){}

string City::getName() const {
    return this -> name;
}
double City::getLat() const {
    return this -> lat;
}
double City::getLon() const {
    return this -> lon;
}
