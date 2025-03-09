import java.util.Scanner;

public class Problem02 {
    public static void main(String args[]) {
        boolean f = true;
        while (f) {
            System.out.print("Month:");
            Scanner in = new Scanner(System.in);
            int month = in.nextInt();
            System.out.print("Year:");
            int year = in.nextInt();
            System.out.println("Days:" + countDays(month, year));
        }

    }
    public static int countDays(int Month, int Year) {

        if (Month == 2) {
            if (Year % 400 == 0 || (Year % 4 == 0 && Year % 100 != 0)) {
                return 29;
            } else {
                return 28;
            }
        } else {
            switch (Month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;

                case 4: case 6: case 9: case 11:
                    return 30;
            }
        }
        return 0;
    }
}
