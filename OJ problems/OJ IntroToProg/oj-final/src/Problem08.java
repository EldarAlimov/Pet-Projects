import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        do{
            System.out.println("All positions change in year "  + x);
            x += 60;
        }while(x <= y );
    }
}
