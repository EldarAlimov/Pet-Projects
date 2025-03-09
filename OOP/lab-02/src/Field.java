public class Field {
    static char MARKED_CELL = '*';
    char TURTLE_CELL = 'T';
    char EMPTY_CELL = '.';
    static int FIELD_WIDTH;
    static int FIELD_HEIGHT;
    static char[][] field;
    Field(int height, int width){
        FIELD_HEIGHT = height;
        FIELD_WIDTH = width;
        field = new char[FIELD_HEIGHT][FIELD_WIDTH];
        for (int y = 0; y < FIELD_HEIGHT; y++) {
            for (int x = 0; x < FIELD_WIDTH; x++) {
                field[y][x] = EMPTY_CELL;
            }
        }
    }
    void displayField(Turtle[] turtles){
        for (int y = 0; y < FIELD_HEIGHT; y++) {
            for (int x = 0; x < FIELD_WIDTH; x++) {
                boolean isTurtle = false;
                for (int i = 0; i < turtles.length; i++) {
                    if (x == turtles[i].X && y == turtles[i].Y) {
                        isTurtle = true;
                        break;
                    }
                }
                if (isTurtle){
                    System.out.print(TURTLE_CELL);
                }else{
                    System.out.print(field[y][x]);
                }

            }
            System.out.println();
        }
    }
    public static boolean areCoordsNorm(int x, int y){
        return x >= 0 && x < FIELD_WIDTH && y >= 0 && y < FIELD_HEIGHT;
    }
    public static void mark(int x, int y){
        if (areCoordsNorm(x, y)){
            field[y][x] = MARKED_CELL;
        }
    }
}
