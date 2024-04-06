#include <string>
#include <vector>


std::string check(std::vector<std::vector<char>> board){
    for(int i = 0; i < 7; ++i){
        while(board[i].size() < 6){
            board[i].push_back('.');
        }
    }
    for (int row = 0; row < 7; ++row) {
        for (int col = 0; col <= 6 - 4; ++col) {
            if (board[row][col] != '.' &&
                board[row][col] == board[row][col + 1] &&
                board[row][col] == board[row][col + 2] &&
                board[row][col] == board[row][col + 3]) {
                return (board[row][col] == 'R') ? "Red" : "Yellow";
            }
        }
    }

    for (int row = 0; row <= 7 - 4; ++row) {
        for (int col = 0; col < 6; ++col) {
            if (board[row][col] != '.' &&
                board[row][col] == board[row + 1][col] &&
                board[row][col] == board[row + 2][col] &&
                board[row][col] == board[row + 3][col]) {
                return (board[row][col] == 'R') ? "Red" : "Yellow";
            }
        }
    }

    for (int row = 0; row <= 7 - 4; ++row) {
        for (int col = 0; col <= 6 - 4; ++col) {
            if (board[row][col] != '.' &&
                board[row][col] == board[row + 1][col + 1] &&
                board[row][col] == board[row + 2][col + 2] &&
                board[row][col] == board[row + 3][col + 3]) {
                return (board[row][col] == 'R') ? "Red" : "Yellow";
            }
        }
    }

    for (int row = 3; row < 7; ++row) {
        for (int col = 0; col <= 6 - 4; ++col) {
            if (board[row][col] != '.' &&
                board[row][col] == board[row - 1][col + 1] &&
                board[row][col] == board[row - 2][col + 2] &&
                board[row][col] == board[row - 3][col + 3]) {
                return (board[row][col] == 'R') ? "Red" : "Yellow";
            }
        }
    }



    return "Draw";
}
std::string who_is_winner(std::vector<std::string> s)
{

    std::vector<std::vector<char>> board(7);
    std::string a;
    for(int i = 0; i < s.size(); i ++){
        board[int(s[i][0])-65].push_back(s[i][2]);
        a = check(board);
        if(a != "Draw") return a;
    }
    return a;

}