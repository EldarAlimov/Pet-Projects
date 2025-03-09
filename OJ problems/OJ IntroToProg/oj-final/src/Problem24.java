import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int win = 0;
        int lose = 0;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if(i+j==10){
                    win++;
                }else
                    lose++;
            }
        }
        if(win==1){
            System.out.println("There is 1 way to get the sum 10.");
        }else{
            System.out.println("There are "+win+" ways to get the sum 10.");
        }
    }
}
