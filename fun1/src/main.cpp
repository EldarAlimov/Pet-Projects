#include <iostream>

using namespace std;

int main()
{
    cout<<"Please, enter the maximum positive distance between a plane can fly (km): ";
    int maxDis;
    cin>>maxDis;
    buildGraph(maxDis);



    return 0;
}