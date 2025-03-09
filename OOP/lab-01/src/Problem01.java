import java.util.Scanner;

public class Problem01 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    static final char MARKED_CELL = '*';
    static final char TURTLE_CELL = 'T';
    static final char EMPTY_CELL = '.';
    static final int FIELD_WIDTH = 20;
    static final int FIELD_HEIGHT = 20;
    static char[][] field;
    static int X, Y, DX, DY;
    static boolean isPenDown;
    static void constructTurtle(){
        X = 0;
        Y = 0;
        isPenDown = false;
        DX = 1;
        DY = 0;
    }

    static void putPenDown(){
        isPenDown = true;
    }
    static void putPenUp(){
        isPenDown = false;
    }
    static void turnRight(){
        int t = DX;
        DX = -DY;
        DY = t;
    }
    static void turnLeft(){
        int t = DX;
        DX = DY;
        DY = -t;
    }
    static void move(int steps){
        for (int i = 0; i < steps; i++) {
            int nextX = X + DX;
            int nextY = Y + DY;

            if (!Problem01.areCoordsNorm(nextX, nextY)){
                break;
            }
            if (isPenDown) {
                Problem01.mark(X, Y);
            }
            X = nextX;
            Y = nextY;
        }
    }
    static void constructField(){
        field = new char[FIELD_HEIGHT][FIELD_WIDTH];
        for (int y = 0; y < FIELD_HEIGHT; y++) {
            for (int x = 0; x < FIELD_WIDTH; x++) {
                field[y][x] = EMPTY_CELL;
            }
        }
    }
    static void displayField(){
        for (int y = 0; y < FIELD_HEIGHT; y++) {
            for (int x = 0; x < FIELD_WIDTH; x++) {
                if (x == X && y == Y){
                    System.out.print(TURTLE_CELL);
                }else{
                    System.out.print(field[y][x]);
                }

            }
            System.out.println();
        }
    }
    static boolean areCoordsNorm(int x, int y){
        return x >= 0 && x < FIELD_WIDTH && y >= 0 && y < FIELD_HEIGHT;
    }
    static void mark(int x, int y){
        if (areCoordsNorm(x, y)){
            field[y][x] = MARKED_CELL;
        }
    }





    public static boolean isParsable(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        constructField();
        constructTurtle();
        while (in.hasNext()){
            String input = in.nextLine();
            String[] parts = input.split(" ");
            if (!(parts.length > 0 && parts[0].trim().length() > 0)){
                continue;
            }
            String command = parts[0].trim();
            command = command.toLowerCase();
            switch (command) {
                case "pen-up":
                    putPenUp();
                    break;
                case "pen-down":
                    putPenDown();
                    break;
                case "turn-right":
                    turnRight();
                    break;
                case "turn-left":
                    turnLeft();
                    break;
                case "move":
                    if (parts.length == 1){
                        System.out.println(ANSI_RED + "The number of steps was not provided. Please, try again." + ANSI_RESET);
                        continue;
                    }
                    if (parts.length > 2){
                        System.out.println(ANSI_RED + "More arguments than necessary were provided for the \"move\" command. Please, try again." + ANSI_RESET);
                        continue;
                    }
                    if (!(isParsable(parts[1]))){
                        System.out.println(ANSI_RED + "The number of steps is not valid. Please, try again." + ANSI_RESET);
                        continue;
                    }
                    int steps = Integer.parseInt(parts[1]);

                    if (steps < 0){
                        System.out.println(ANSI_RED + "The number of steps can't be negative. Please, try again." + ANSI_RESET);
                        continue;
                    }
                    move(steps);
                    break;
                case "display":
                    displayField();
                    break;
                case "exit":
                    System.exit(0);
                    break;
                case "":
                    System.out.println(ANSI_RED + "No commands to execute were provided. Please, try again.e" + ANSI_RESET);
                    break;
                default:
                    System.out.println(ANSI_RED + "Unknown command. Please, try again." + ANSI_RESET);
                    break;
            }
        }
    }





}
