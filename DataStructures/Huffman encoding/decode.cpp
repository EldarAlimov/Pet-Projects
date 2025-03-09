#include <bits/stdc++.h>

std::map<std::string, char>  read_codes(const std::string& path){
    std::ifstream file(path);
    std::string line;
    std::map<std::string, char> codes;
    while(std::getline(file, line)){
        if (line.empty()){
            continue;
        }
        //format of the line <code>:<symbol>
        std::string code = line.substr(0, line.find(':'));
        std::string symbol_str = line.substr(line.find(':') + 1);
        char symbol;
        if (symbol_str.empty()) {
            symbol = '\n';
        } else {
            symbol = symbol_str[0];
        }

        codes[code] = symbol;
    }

    return codes;
}

std::string decode(std::map<std::string, char>& codes, const std::string& filePath) {
    std::ifstream file(filePath, std::ios::binary);
    std::ostringstream binaryStream;
    char byte;
    while (file.get(byte)) {
        binaryStream << std::bitset<8>(byte);
    }
    file.close();
    std::string binaryContent = binaryStream.str();
    std::string decodedText = "";
    std::string currentCode = "";
    for(int i = 0;i < binaryContent.size()-1;++i) {
        currentCode += binaryContent[i];
        if(codes.find(currentCode) != codes.cend()) {
            decodedText += codes[currentCode];
            currentCode = "";
        }
    }


    return decodedText;
}

std::string read_file(const std::string& path){
    std::ifstream file(path);
    std::string line;
    std::string file_content;
    while(std::getline(file, line)){
        file_content += line + "\n";
    }
    return file_content;
}


int main(){
    auto codes =  read_codes("../pain3/encoded_pairs.txt");
    std::string test = "test";
    std::cout<<test<<std::endl;
    std::string res = decode(codes, "../pain3/encoded_text.bin");
    //std::string example = read_file("../ex_text.txt");
    std::ofstream out_file("../pain3/decoded_text.txt");
    out_file << res;
}