class Pong {
public:
    int max_score;
    bool isF; // turn
    int scoreF;
    int scoreS;
    bool isO; // is over
    Pong(int _max_score): max_score(_max_score) {
        scoreF=0;
        scoreS=0;
        isF=true;
        isO = false;
    };

    std::string play(int ball_pos, int player_pos) {
        if(isO) return "Game Over!";

        if(ball_pos-player_pos > 3 || ball_pos-player_pos < -3){
            if(isF){
                isF = !isF;
                this->scoreS++;
                if(scoreS >= max_score){
                    isO=true;
                    return "Player 2 has won the game!";
                }
                return "Player 1 has missed the ball!";
            } else{
                isF = !isF;
                this->scoreF++;
                if(scoreF == max_score) {
                    isO = true;
                    return "Player 1 has won the game!";
                }
                return "Player 2 has missed the ball!";
            }
        }
        isF = !isF;
        return isF ? "Player 2 has hit the ball!" : "Player 1 has hit the ball!";
    };
};