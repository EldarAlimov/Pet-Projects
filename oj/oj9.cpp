#include <iostream>
#include <vector>

using namespace std;

void queen(int row, int col, vector<vector<int>> &b) {
    for (int i = 0; i < 8; i++) {
        b[row][i] = 1;
        b[i][col] = 1;
    }

    int x = col, y = row;
    while (x+1 < 8 && y+1 < 8) {
        x++;
        y++;
        b[y][x] = 1;
    }

    x = col, y = row;
    while (x-1 >= 0 && y+1 < 8) {
        x--;
        y++;
        b[y][x] = 1;
    }

    x = col, y = row;
    while (x+1 < 8 && y-1 >= 0) {
        x++;
        y--;
        b[y][x] = 1;
    }

    x = col, y = row;
    while (x-1 >= 0 && y-1 >= 0) {
        x--;
        y--;
        b[y][x] = 1;
    }
}


int main()
{
    vector<string>board(8);
    vector<vector<int>> b(8, vector<int>(8, 0));
    for (int i = 0; i < 8; i++) {
        cin>>board[i];
    }
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            if(board[i][j] == '*'){
                if(b[i][j] == 1){
                    cout<<"invalid"<<endl;
                    return 0;
                }
                queen(i, j, b);
            }
        }

    }
    cout<<"valid"<<endl;
    return 0;
}
