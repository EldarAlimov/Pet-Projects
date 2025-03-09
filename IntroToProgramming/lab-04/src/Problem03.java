import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System. in);
        System.out.print("month? ");
        int m = in.nextInt();
        String ms = "wrong number";
        switch(m){
            case 1: case 2: case 12:
                ms = "winter";
                break;
            case 3: case 4: case 5:
                ms = "spring";
                break;
            case 6: case 7: case 8:
                ms = "summer";
                break;
            case 9: case 10: case 11:
                ms = "autumn";
                break;
        }
        System.out.println(ms);
    }
}
