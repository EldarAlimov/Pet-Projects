import java.util.Scanner;

public class URI1241 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String st1 = in.next();
            String st2 = in.next();
            boolean flag = st1.endsWith(st2);
            if (flag){
                System.out.println("encaixa");
            }else {
                System.out.println("nao encaixa");
            }

        }
    }
}
