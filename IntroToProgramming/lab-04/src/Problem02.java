import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("month? ");
        int m = in.nextInt();
        if (m == 1 || m == 2 || m == 12){
            System.out.println("winter");
        }
        else{
            if (m == 3 || m == 4 || m == 5){
                System.out.println("spring");
            }
            else{
                if (m == 6 || m == 7 || m == 8){
                    System.out.println("summer");
                }
                else{
                    if (m == 9 || m == 10 || m == 11){
                        System.out.println("autumn");
                    }
                }

            }

        }

    }
}
