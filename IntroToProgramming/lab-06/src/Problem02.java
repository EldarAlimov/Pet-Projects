import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Year: ");
        int a = in.nextInt();
        int leap = 0;
        if (a % 400 ==0){
            leap = 1;
        }
        else {
            if (a % 100 == 0){
            }
            else {
                if (a % 4 == 0 ){
                    leap = 1;
                }
            }
        }
        System.out.print("Month: ");
        int m = in.nextInt();
        int ms = 0;
        switch(m){
            case 1: case 3: case 5: case 7: case 8: case 10: case 13:
                ms = 31;
                break;
            case 6: case 4: case 9: case 11:
                ms = 30;
                break;
            case 2:
                ms = 28 + leap;
                break;
        }
        System.out.println("Number of days: " + ms);

    }
}