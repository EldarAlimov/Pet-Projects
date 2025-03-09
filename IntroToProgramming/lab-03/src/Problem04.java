import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Year? ");
        int a = in.nextInt();
        if (a % 400 ==0){
            System.out.println("This is a leap year.");
        }
        else {
            if (a % 100 == 0){
                System.out.println("This is not a leap year.");
            }
            else {
                if (a % 4 == 0 ){
                    System.out.println("This is a leap year.");
                }
                else {
                    System.out.println("This is not a leap year.");
                }
            }
        }

    }
}