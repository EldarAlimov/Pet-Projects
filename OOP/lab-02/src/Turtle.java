
public class Turtle {
     int X, Y, DX, DY;
     boolean isPenDown;
     Turtle(int x, int y, String turn, boolean isPenDown){
        X = x;
        Y = y;
        isPenDown = isPenDown;
        switch (turn){
            case "up":
                DX = 0;
                DY = -1;
                break;
            case "right":
                DX = 1;
                DY = 0;
                break;
            case "down":
                DX = 0;
                DY = 1;
                break;
            default:
                DX = -1;
                DY = 0;
                break;

        }
    }

    void putPenDown(){
        isPenDown = true;
    }
     void putPenUp(){
        isPenDown = false;
    }
     void turnRight(){
        int t = DX;
        DX = -DY;
        DY = t;
    }
     void turnLeft(){
        int t = DX;
        DX = DY;
        DY = -t;
    }
     public void move(int steps){
        for (int i = 0; i < steps; i++) {
            int nextX = X + DX;
            int nextY = Y + DY;

            if (!Field.areCoordsNorm(nextX, nextY)){
                break;
            }
            if (isPenDown) {
                Field.mark(X, Y);
            }
            X = nextX;
            Y = nextY;
        }
    }
}
