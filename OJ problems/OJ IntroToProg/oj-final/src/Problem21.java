import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int P = scanner.nextInt();
        int N = scanner.nextInt();
        int R = scanner.nextInt();
        int infected = N;
        int infected_total = N;
        int days = 0;
        do{
            if(infected_total>P) {
                System.out.println(days);
                break;
            }
            infected*=R;
            infected_total+=infected;
            days++;
        }while(N<=P);
    }
}
