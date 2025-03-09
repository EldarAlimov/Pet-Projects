import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Problem02 {
    static final String[] allowedOperations = {"+", "-", "*", "/", "<", ">", "=", "!=", "<=", ">="};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Calculator of Rational Numbers\n" +
                "==============================\n" +
                "Press Ctrl-D to exit");
        try {
            while (true) {
                System.out.println();
                BigRational r1;
                while (true){
                    System.out.print("First Rational: ");
                    String s1 = in.next();

                    try {
                        r1 = BigRational.parseBigRational(s1);
                    } catch (IllegalArgumentException e) {
                        System.err.println("Error: " + e.getMessage());
                        System.out.println();
                        continue;
                    }
                    break;
                }

                String op;
                while (true){
                    System.out.print("Operator: ");
                    op = in.next();
                    try {
                        if (!Arrays.asList(allowedOperations).contains(op)) {
                            throw new IllegalArgumentException("'" + op + "' is not a valid operator.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.err.println("Error: " + e.getMessage());
                        System.out.println();
                        continue;
                    }
                    break;
                }
                BigRational r2;
                while (true){
                    System.out.print("Second Rational: ");
                    String s2 = in.next();

                    try {
                        r2 = BigRational.parseBigRational(s2);
                    } catch (IllegalArgumentException e) {
                        System.err.println("Error: " + e.getMessage());
                        System.out.println();
                        continue;
                    }
                    break;
                }


                int c = r1.compare(r2);
                String output = "";
                try {
                    switch (op) {
                        case "+":
                            output = r1.add(r2).toString();
                            break;
                        case "-":
                            output = r1.subtract(r2).toString();
                            break;
                        case "*":
                            output = r1.multiply(r2).toString();
                            break;
                        case "/":
                            output = r1.divide(r2).toString();
                            break;
                        case "<":
                            if (c == -1) output = "true";
                            if (c == 0) output = "false";
                            if (c == 1) output = "false";
                            break;
                        case "=":
                            if (c == -1) output = "false";
                            if (c == 0) output = "true";
                            if (c == 1) output = "false";
                            break;
                        case ">":
                            if (c == -1) output = "false";
                            if (c == 0) output = "false";
                            if (c == 1) output = "true";
                            break;
                        case "!=":
                            if (c == -1) output = "true";
                            if (c == 0) output = "false";
                            if (c == 1) output = "true";
                            break;
                        case "<=":
                            if (c == -1) output = "true";
                            if (c == 0) output = "true";
                            if (c == 1) output = "false";
                            break;
                        case ">=":
                            if (c == -1) output = "false";
                            if (c == 0) output = "true";
                            if (c == 1) output = "true";
                            break;
                        default:
                            throw new IllegalArgumentException("'" + op + "' is not a valid operator.");
                    }
                } catch (IllegalArgumentException e) {
                    System.err.println("Error: " + e);
                    System.out.println();
                    continue;
                }
                System.out.println("Result: " + r1.toString() + " " + op + " " + r2.toString() + ": " + output);
            }
        }catch (NoSuchElementException e){
            System.exit(1);
        }
    }
}
