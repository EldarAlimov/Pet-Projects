
#include "Biginteger.h"
#include "cmath"
#include "iostream"
#include "vector"
#include "BigIntException.cpp"

using namespace std;

BigInt::BigInt(int number) {
    value.clear();
    value.push_back(abs(number));
    isNegative = (number < 0);
}
BigInt::BigInt(const string &s){
    isNegative = false;
    if(s[0] == '-'){
        isNegative = true;
        for (int i=s.size()-1; i>=1; i--){
            if(!(s[i]>='0' && s[i]<='9')){
                throw BigIntException("Invalid input format");
            }
            value.push_back(s[i]-'0');
        }
    }else{
        for (int i=s.size()-1; i>=0; i--){
            if(!(s[i]>='0' && s[i]<='9')){
                throw BigIntException("Invalid input format");
            }
            value.push_back(s[i]-'0');
        }
    }

}

/**
   * @brief Compare two BigInt objects.
   *
   * This method compares two BigInt objects and determines their relationship.
   *
   * @param val1 The first BigInt object for comparison.
   * @param val2 The second BigInt object for comparison.
   * @return -1 if val1 < val2, 0 if val1 == val2, and 1 if val1 > val2.
   *
   * @details
   * The method compares the two BigInt objects by first checking their signs.
   * If both operands have the same sign, the digits of the BigInt objects are compared
   * from left to right. The comparison stops at the first differing digit.
   * - If val1 < val2, returns -1 (or 1 if val1 is negative).
   * - If val1 > val2, returns 1 (or -1 if val1 is negative).
   * - If val1 == val2, returns 0.
   *
   * @note
   * - This method is used internally by comparison operators (==, !=, <, <=, >, >=) of the BigInt class.
   * - The method assumes that both BigInt objects are normalized (leading zeros are removed).
   *
   * @see operator==, operator!=, operator<, operator<=, operator>, operator>=
   */
int compare(const BigInt &val1,const BigInt &val2){
    if(val1.isNegative==val2.isNegative){
        for(int i = 0 ; i < val1.value.size();i++){
            if(val1.value[i]<val2.value[i]){
                return val1.isNegative? 1 : -1;
            }
            if(val1.value[i]>val2.value[i]){
                return val1.isNegative? -1 : 1;
            }
        }
        return 0;
    }
    else{

        return val1.isNegative? -1:1;
    }
}

bool operator==(const BigInt &val1,const BigInt &val2){
    return compare(val1, val2) == 0;
};
bool operator!=(const BigInt &val1,const BigInt &val2){
    return compare(val1, val2) != 0;
};
bool operator<(const BigInt &val1,const BigInt &val2){
    return compare(val1, val2) == -1;
};
bool operator<=(const BigInt &val1,const BigInt &val2){
    return compare(val1, val2) != 1;
};
bool operator>(const BigInt &val1,const BigInt &val2){
    return compare(val1, val2) == 1;
};
bool operator>=(const BigInt &val1,const BigInt &val2){
    return compare(val1, val2) != -1;
};

/**
     * @brief Overloaded addition operator for BigInt objects.
     *
     * This operator allows addition of two BigInt objects, handling cases where
     * the operands have different signs and different lengths.
     *
     * @param other The BigInt object to be added to the current object.
     * @return A new BigInt object representing the sum of the current object
     *         and the provided BigInt object.
     *
     * @details
     * The addition operation is performed digit by digit, starting from the least
     * significant digit. If both operands have the same sign, they are added directly.
     * If the signs are different, the subtraction operation is used to handle the addition
     * of absolute values, and the sign of the result is adjusted accordingly.
     *
     * @note
     * - The resulting BigInt object is trimmed to remove leading zeros.
     * - The current object and the provided BigInt object remain unchanged.
     */
BigInt BigInt::operator+(const BigInt& other){
    BigInt result = *this;
    if(result.isNegative == other.isNegative) {
        int carry = 0;
        for (size_t i=0; i < max(result.value.size(),other.value.size()) || carry; ++i) {
            if (i == result.value.size())
                result.value.push_back (0);
            result.value[i] += carry + (i < other.value.size() ? other.value[i] : 0);
            carry = result.value[i] >= base;
            if (carry)  result.value[i] -= base;
        }
        return result;
    }
    else {
        BigInt temp = other;
        temp.isNegative= false;
        result.isNegative= false;
        return other.isNegative ? result-temp : temp-result;
    }
}
/**
     * @brief Compound addition operator for BigInt objects.
     *
     * This operator performs a compound addition operation on the current BigInt
     * object and another BigInt object. The result is stored in the current object.
     *
     * @param other The BigInt object to be added to the current object.
     * @return A reference to the current BigInt object after the addition operation.
     *
     * @details
     * This operator internally uses the overloaded addition operator (`+`) to perform
     * the addition operation. It creates a temporary BigInt object by adding the current
     * object and the provided BigInt object. Then, it assigns the value of the temporary
     * object to the current object, effectively updating the current object with the sum.
     *
     * @note
     * - The method modifies the current BigInt object.
     * - The provided BigInt object remain unchanged.
     *
     * @see operator+, operator=, operator+
     */
BigInt& BigInt::operator+=(const BigInt &other) {
    BigInt result = *this + other;
    *this = result;
    return *this;
}

/**
    * @brief Overloaded subtraction operator for BigInt objects.
    *
    * This operator performs subtraction of two BigInt objects, handling cases where
    * the operands have different signs and different lengths.
    *
    * @param other The BigInt object to be subtracted from the current object.
    * @return A new BigInt object representing the difference of the current object
    *         and the provided BigInt object.
    *
    * @details
    * The subtraction operation is performed digit by digit, starting from the least
    * significant digit. If the signs of the operands are different, the subtraction
    * is handled by adding the absolute values and adjusting the sign of the result.
    * If the signs are the same, the subtraction is performed normally.
    *
    * @note
    * - The resulting BigInt object is trimmed to remove leading zeros.
    * - The current object and the provided BigInt object remain unchanged.
    */

BigInt BigInt::operator-(const BigInt& other) const{
    BigInt result = *this;
    if(result.isNegative != other.isNegative){
        BigInt temp = other;
        temp.isNegative = result.isNegative;
        return result+temp;
    }

    result.isNegative = false;
    BigInt temp = other;
    temp.isNegative = false;
    if (temp > result) {
        result = temp - result;

        result.isNegative = !other.isNegative;
        return result;
    }

    int carry = 0;

    for (size_t i=0; i<other.value.size() || carry; ++i) {
        result.value[i] -= carry + (i < other.value.size() ? other.value[i] : 0);
        carry = result.value[i] < 0;
        if (carry)  result.value[i] += base;
    }
    while (result.value.size() > 1 && result.value.back() == 0)
        result.value.pop_back();
    result.isNegative=other.isNegative;
    return result;
}


/**
 * @brief Compound subtraction operator for BigInt objects.
 *
 * This operator performs a compound subtraction operation on the current BigInt
 * object and another BigInt object. The result is stored in the current object.
 *
 * @param other The BigInt object to be subtracted from the current object.
 * @return A reference to the current BigInt object after the subtraction operation.
 *
 * @details
 * This operator internally uses the overloaded subtraction operator (`-`) to perform
 * the subtraction operation. It creates a temporary BigInt object by subtracting the
 * provided BigInt object from the current object. Then, it assigns the value of the
 * temporary object to the current object, effectively updating the current object with
 * the difference.
 *
 * @note
 * - The method modifies the current BigInt object.
 * - The provided BigInt object remain unchanged.
 *
 */
BigInt& BigInt::operator-=(const BigInt &other) {
    BigInt result = *this - other;
    *this = result;
    return *this;
};


/**
    * @brief Overloaded multiplication operator for BigInt objects.
    *
    * This operator performs multiplication of two BigInt objects, producing a new
    * BigInt object representing their product.
    *
    * @param other The BigInt object to be multiplied with the current object.
    * @return A new BigInt object representing the product of the current object
    *         and the provided BigInt object.
    *
    * @details
    * The multiplication operation is performed digit by digit using the standard
    * multiplication algorithm. The resulting BigInt object is trimmed to remove
    * leading zeros, and its sign is determined based on the signs of the operands.
    *
    * @note
    * - The method assumes that both BigInt objects are normalized (leading zeros are removed).
    * - The current object and the provided BigInt object remain unchanged.
    */
BigInt BigInt::operator*(const BigInt &other) const{
    BigInt result(0);
    result.value.resize(value.size()+other.value.size());
    for (size_t i=0; i<value.size(); ++i) {
        for (int j=0, carry=0; j<(int)other.value.size() || carry; ++j) {
            long long cur = result.value[i+j] + value[i] * 1ll * (j < (int)other.value.size() ? other.value[j] : 0) + carry;
            result.value[i+j] = int (cur % base);
            carry = int (cur / base);
        }
    }
    while (result.value.size() > 1 && result.value.back() == 0)
        result.value.pop_back();
    if(isNegative == other.isNegative) {
        result.isNegative = false;
    }
    else {
        result.isNegative = true;
    }
    return result;
};

/**
    * @brief Compound multiplication operator for BigInt objects.
    *
    * This operator performs a compound multiplication operation on the current BigInt
    * object and another BigInt object. The result is stored in the current object.
    *
    * @param other The BigInt object to be multiplied with the current object.
    * @return A reference to the current BigInt object after the multiplication operation.
    *
    * @details
    * This operator internally uses the overloaded multiplication operator (`*`) to perform
    * the multiplication operation. It creates a temporary BigInt object by multiplying the
    * current object and the provided BigInt object. Then, it assigns the value of the temporary
    * object to the current object, effectively updating the current object with the product.
    *
    * @note
    * - The method modifies the current BigInt object.
    * - The provided BigInt object remain unchanged.
    *
    */
BigInt& BigInt::operator*=(const BigInt &other) {
    BigInt result = *this * other;
    *this = result;
    return *this;
};


/**
 * @brief Overloaded division operator for BigInt objects.
 *
 * @details
 * The division operation is performed using a binary search algorithm to find
 * the quotient. The method first checks for division by zero and throws an exception
 * if the divisor is zero. Then, it performs the division by iteratively narrowing down
 * the search space until it finds the largest quotient where the product of the divisor
 * and the quotient is less than or equal to the dividend.
 *
 * @note
 * - The method assumes that both BigInt objects are normalized (leading zeros are removed).
 * - Division by zero is not allowed and will result in a BigIntException.
 *
 * @param other The BigInt object to be divided by the current object.
 * @return A new BigInt object representing the quotient of the current object divided by the provided BigInt object.
 *
 * @exception BigIntException Thrown if the provided divisor is zero.
 */
BigInt BigInt::operator/(const BigInt &other)const{
    if(other == 0){
        throw BigIntException("Can not divide by zero");
    }
    BigInt a = *this , b = other;
    a.isNegative = false;
    b.isNegative = false;
    BigInt l = 0 , r = a + 1;
    while(r - l > 1) {
        BigInt m = (l + r) / 2;
        if(b * m <= a) {
            l = m;
        }
        else {
            r = m;
        }
    }
    if(isNegative != other.isNegative) {
        l.isNegative = true;
    }
    return l;
};

/**
 * @brief Compound division-assignment operator for BigInt objects.
 *
 * @details
 * This operator divides the current BigInt object by the provided BigInt object
 * using the division operator and assigns the quotient back to the current object.
 *
 * @param other The BigInt object by which the current object is divided.
 * @return A reference to the current BigInt object after division.
 *
 * @exception BigIntException Thrown if the provided divisor is zero.
 */
BigInt& BigInt::operator/=(const BigInt &other){
    if(other == 0)
        throw BigIntException("Con not divide by zero");
    BigInt result = *this / other;
    *this = result;
    return *this;
}

BigInt BigInt::operator%(const BigInt &other) const{
    BigInt temp = *this/other;
    return *this - (temp*other);
}
BigInt& BigInt::operator%=(const BigInt &other){
    BigInt result = *this % other;
    *this = result;
    return *this;
}



/**
 * @brief Calculates the factorial of a non-negative integer.
 *
 * This method calculates the factorial of the specified non-negative integer 'n'
 * and returns the result as a new BigInt object.
 *
 * @param n The non-negative integer for which the factorial is to be calculated.
 * @return A new BigInt object representing the factorial of the specified integer.
 *
 * @exception BigIntException Thrown if the provided integer 'n' is negative.
 */

BigInt BigInt::factorial(int n) {
    if(n<0)
        throw BigIntException("Invalid argument exception");
    BigInt result= 1;
    for(int i = 1; i <= n; i++){
        result *=i;
    }
    return result;

}


/**
    * @brief Calculates the Greatest Common Divisor (GCD) of two BigInt objects.
    *
    * This method calculates the GCD of the current BigInt object and the provided
    * BigInt object using the Euclidean algorithm and returns the result as a new BigInt object.
    *
    * @param other The BigInt object with which the GCD is to be calculated.
    * @return A new BigInt object representing the GCD of the current object and the provided BigInt object.
    *
    * @details
    * This method calculates the GCD of two BigInt objects using the Euclidean algorithm.
    * It iteratively applies the modulo operation until one of the numbers becomes zero,
    * and then returns the non-zero number as the GCD.
    *
    * @note
    * - The method assumes that both BigInt objects are normalized (leading zeros are removed).
    * - If both numbers are zero, the method returns zero as the GCD.
    *
    * @param other The BigInt object with which the GCD is to be calculated.
    * @return A new BigInt object representing the GCD of the current object and the provided BigInt object.
    */
BigInt BigInt::gcd(const BigInt &other){
    BigInt a = *this;
    BigInt b = other;
    while(b!=0 || a!=0){
        if(a>b)
            a %=b;
        else
            b %=a;
    }
    return a==0? b:a;
}

/**
   * @brief Calculates the power of a BigInt object.
   *
   * @details
   * This method calculates the power of the current BigInt object using repeated multiplication.
   * If the exponent is negative, an exception is thrown. If the exponent is 0, the method returns 1.
   * Otherwise, it iteratively multiplies the current BigInt object by itself until the exponent
   * becomes 0, effectively calculating the power.
   *
   * @param exponent The exponent to which the current BigInt object is raised.
   * @return A new BigInt object representing the result of the power operation.
   *
   * @exception BigIntException Thrown if the provided exponent is negative.
   */
BigInt BigInt::pow(int exponent) {
    BigInt temp = *this;
    BigInt result = temp;
    if(exponent<0)
        throw BigIntException("Invalid argument exception");
    if(exponent == 0) {
        return 1;
    }
    while(exponent > 0){
        result*=temp;
        exponent--;
    }
    return result;
};


/**
     * @brief Overloaded output stream operator for BigInt objects.
     *
     * @details
     * This operator checks the sign of the BigInt object and adds a negative sign '-' if it's negative,
     * except for zero. It then prints the digits of the BigInt object in reverse order, omitting leading zeros.
     * If the BigInt object is zero, it prints '0'.
     *
     * @param out The output stream to which the BigInt object is to be printed.
     * @param a The BigInt object to be printed.
     * @return A reference to the output stream after the BigInt object has been printed.
     */
ostream& operator<<(ostream &out, const BigInt &a){
    if(a.isNegative && !(a.value.size()==1 && a.value[0] == 0)){
        out<<'-';
    }
    out << (a.value.empty() ? 0 : "");
    for (int i=(int)a.value.size()-1; i>=0; --i)
        out << a.value[i];
    return out;
}


/**
 * @brief Overloaded input stream operator for BigInt objects.
 *
 * @details
 * This operator reads a string from the input stream and initializes the provided
 * BigInt object with the parsed value. The input is expected to be a string
 * representing a valid integer. If the input format is invalid, it may throw an
 * exception, or handle the error based on the implementation.
 *
 * @param in The input stream from which the BigInt object is to be read.
 * @param a The BigInt object to store the input value.
 * @return A reference to the input stream after the BigInt object has been read.
 *
 * @note
 * - This operator assumes that the input format is a valid integer represented as a string.
 * - Error handling for invalid input formats may vary based on the implementation.
 */
istream& operator>>(istream& in, BigInt &a){
    string s;
    in>>s;
    a = BigInt(s);
    return in;
}





int main(){
    vector<int> s1 = {1, 2, 3, 4, 5, 6, 7, 8,9};
    string s = "123456789";
    BigInt a(0);
    BigInt b(0);
    cin>>a;
    cin>>b;
    cout<<a.pow(4);
    return 0;
}


