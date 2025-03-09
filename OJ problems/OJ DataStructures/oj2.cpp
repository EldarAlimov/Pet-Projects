#include <vector>

std::vector<std::vector<int> > matrixAddition(std::vector<std::vector<int> > a,std::vector<std::vector<int> > b){
    int s = a.size();
    std::vector<std::vector<int>> out(s, std::vector<int>(s));
    for(int i=0; i<s; i++){
        for(int j=0; j<s; j++){
            out[i][j]=a[i][j]+b[i][j];
        }
    }
    return out;

}