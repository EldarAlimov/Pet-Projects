//
// Created by gignt on 15.02.2024.
//

#ifndef ALGORITHMS_PERSONAL_REPO_ALIMOV_E_AUCA_2022_STUFF_CITIES_H
#define ALGORITHMS_PERSONAL_REPO_ALIMOV_E_AUCA_2022_STUFF_CITIES_H

#include <string>

using namespace std;
class City {
private:
    string name;
    double lat;
    double lon;
public:
    City(string name, double lat, double lon);
    string getName() const;
    double getLat() const;
    double getLon() const;

};


#endif //ALGORITHMS_PERSONAL_REPO_ALIMOV_E_AUCA_2022_STUFF_CITIES_H
