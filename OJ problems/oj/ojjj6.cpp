#include <string>


std::string & ltrim(std::string & str)
{
    auto it2 =  std::find_if( str.begin() , str.end() , [](char ch){ return !std::isspace<char>(ch , std::locale::classic() ) ; } );
    str.erase( str.begin() , it2);
    return str;
}

std::string & rtrim(std::string & str)
{
    auto it1 =  std::find_if( str.rbegin() , str.rend() , [](char ch){ return !std::isspace<char>(ch , std::locale::classic() ) ; } );
    str.erase( it1.base() , str.end() );
    return str;
}

std::string decodeMorse(const std::string& morseCode) {

    std::string decoded;
    std::string letter;
    for(int i = 0; i < morseCode.size(); i++) {
        if(morseCode[i] == ' '){
            decoded += MORSE_CODE[letter];
            letter = "";
            if(morseCode[i+1] == ' '){
                decoded += " ";
                i +=2;
            }
        }else{
            letter += morseCode[i];
        }
    }
    decoded += MORSE_CODE[letter];
    ltrim(rtrim(decoded));
    return decoded;
}
