

#ifndef DS_REPO_ALIMOV_E_AUCA_2022_BIGINTEGER_H
#define DS_REPO_ALIMOV_E_AUCA_2022_BIGINTEGER_H

#endif //DS_REPO_ALIMOV_E_AUCA_2022_BIGINTEGER_H
#include <vector>
#include <string>
using namespace std;

const int base = 10;

class BigInt{
    private:

        vector<int> value;
        bool isNegative;
    public:
        BigInt(int number);
        BigInt(const string &s);


        friend int compare(const BigInt &val1, const BigInt &val2);
        friend bool operator<(const BigInt &val1,const BigInt &val2);
        friend bool operator<=(const BigInt &val1,const BigInt &val2);
        friend bool operator>(const BigInt &val1,const BigInt &val2);
        friend bool operator>=(const BigInt &val1,const BigInt &val2);


        BigInt operator+(const BigInt &other);
        BigInt& operator+=(const BigInt &other);
        BigInt operator-(const BigInt &other)const;
        BigInt& operator-=(const BigInt &other);
        BigInt operator*(const BigInt &other)const;
        BigInt& operator*=(const BigInt &other);


        BigInt operator/(const BigInt &other)const;
        BigInt& operator/=(const BigInt &other);
        BigInt operator%(const BigInt &other)const;
        BigInt& operator%=(const BigInt &other);

        static BigInt factorial(int n);
        BigInt gcd(const BigInt &other);
        BigInt pow(int exponent);


        friend ostream& operator<<(ostream &out, const BigInt &a);

        friend istream& operator>>(istream& in, BigInt &a);



};


