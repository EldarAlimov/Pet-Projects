import java.sql.SQLOutput;
import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int a = in.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int b = in.nextInt();
        String today;
        switch (a){
            case 0:
                today = "Sunday ";
                break;
            case 1:
                today = "Monday ";
                break;
            case 2:
                today = "Tuesday ";
                break;
            case 3:
                today = "Wednesday ";
                break;
            case 4:
                today = "Thursday ";
                break;
            case 5:
                today = "Friday ";
                break;
            case 6:
                today = "Saturday ";
                break;
            default:
                today = "0";
                break;
        }
        b = b + a;
        b = b % 7;
        String che;
        switch (b){
            case 0:
                che = "Sunday ";
                break;
            case 1:
                che = "Monday ";
                break;
            case 2:
                che = "Tuesday";
                break;
            case 3:
                che = "Wednesday ";
                break;
            case 4:
                che = "Thursday ";
                break;
            case 5:
                che = "Friday ";
                break;
            case 6:
                che = "Saturday ";
                break;
            default:
                che = "0";
                break;
        }
        System.out.println("Today is " + today + "and the future day is " + che);



    }
}