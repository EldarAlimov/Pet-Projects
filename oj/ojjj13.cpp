#include <string>

std::string generateName()
{
    char letters[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    char out[7];
    do{
        for (int i = 0; i < 6; ++i){
            out[i] = letters[rand()%52];
        }
        out[6] = '\0';
    }while(photoManager.nameExists(out));
    return out;

}