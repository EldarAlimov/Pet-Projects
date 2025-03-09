//
// Created by gignt on 01.11.2023.
//
#include <exception>
#include <string>

using namespace std;
class BigIntException : public std::exception {
private:
    std::string message;

public:
    BigIntException(const string errorMessage) : message(errorMessage){}
    const char * what() const noexcept override{
        return message.c_str();
    }
};
