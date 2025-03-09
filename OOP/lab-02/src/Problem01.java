import java.util.Scanner;

public class Problem01 {
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
        Field field = new Field(20, 20);
        Turtle turtle1 = new Turtle(0, 0, "right", false);
        Turtle turtle2 = new Turtle(Field.FIELD_HEIGHT -1, Field.FIELD_WIDTH -1, "left", false);
        Turtle[] turtles = {turtle1, turtle2};
        Turtle cTurtle = turtle1;
        while (in.hasNext()){
            String input = in.nextLine();
            String[] parts = input.split(" ");
            if (!(parts.length > 0 && parts[0].trim().length() > 0)){
                continue;
            }
            String command = parts[0].trim();
            command = command.toLowerCase();
            try {
                if (command.isEmpty()) throw new IllegalArgumentException("No commands to execute were provided. Please, try again.");
                switch (command) {
                    case "select":
                        if (parts.length == 1) {
                            throw new IllegalArgumentException("The turtle number was not provided. Please, try again.");
                        }
                        if (parts.length > 2) {
                            throw new IllegalArgumentException("More arguments than necessary were provided for the \"select\" command. Please, try again.");
                        }
                        int turtleNum;
                        try {
                            turtleNum = Integer.parseInt(parts[1]);
                        } catch (NumberFormatException e) {
                            throw new NumberFormatException("The turtle number is not valid. Please, try again.");
                        }
                        if (!(turtleNum == 1 || turtleNum == 2)) {
                            throw new NumberFormatException("There is no turtle with the number \"" + parts[1] + "\". Please, try again.");
                        }
                        cTurtle = turtleNum == 1 ? turtle1 : turtle2;
                        break;
                    case "pen-up":
                        cTurtle.putPenUp();
                        break;
                    case "pen-down":
                        cTurtle.putPenDown();
                        break;
                    case "turn-right":
                        cTurtle.turnRight();
                        break;
                    case "turn-left":
                        cTurtle.turnLeft();
                        break;
                    case "move":
                        if (parts.length == 1) {
                            throw new IllegalArgumentException("The number of steps was not provided. Please, try again.");
                        }
                        if (parts.length > 2) {
                            throw new IllegalArgumentException("More arguments than necessary were provided for the \"move\" command. Please, try again.");
                        }
                        int steps;
                        try {
                            steps = Integer.parseInt(parts[1]);
                        } catch (NumberFormatException e) {
                            throw new NumberFormatException("The number of steps is not valid. Please, try again.");
                        }
                        if (steps < 0) {
                            throw new NumberFormatException("The number of steps can't be negative. Please, try again.");
                        }
                        cTurtle.move(steps);
                        break;
                    case "display":
                        field.displayField(turtles);
                        break;
                    case "exit":
                        System.exit(0);
                        break;
                    default:
                        throw new NumberFormatException("Unknown command. Please, try again.");
                }
            } catch (IllegalArgumentException e) {
                System.err.println(e);
            }
        }
    }
}
