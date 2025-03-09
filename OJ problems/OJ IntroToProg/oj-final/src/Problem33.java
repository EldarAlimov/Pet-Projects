import java.util.Scanner;


public class Problem33 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int year = in.nextInt();
            int month = in.nextInt();
            int day = in.nextInt();
            int ans = day;
            for (int j = 1; j < month; j++) {
                ans += fromMonthToDays(j, isLeap(year));
            }
            System.out.println(ans);
        }
    }

    public static boolean isLeap(int a) {
        boolean f = false;
        if (a % 400 ==0){
            f = true;
        }
        else {
            if (a % 100 == 0){
            }
            else {
                if (a % 4 == 0 ){
                    f = true;
                }
            }
        }
        return f;
    }
    public static int fromMonthToDays(int d, boolean isLeap){
        int ms = 0;
        switch(d){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                ms = 31;
                break;
            case 6: case 4: case 9: case 11:
                ms = 30;
                break;
            case 2:
                ms = 28;
                if (isLeap) ms++;
                break;
        }
        return ms;
    }
}
