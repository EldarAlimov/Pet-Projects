import java.util.Scanner;

public class URI1329 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.next());
        while(n!=0){

            int a = 0;
            String[] S = new String[n];
            in.nextLine();
            String s = in.nextLine();
            S = s.split(" ");
            for (int i = 0; i < n; i++) {
                if (S[i].equals("0")){
                    a++;
                }
            }
            int b = n-a;
            System.out.println("Mary won " + a + " times and John won " + b +  " times");
            n = in.nextInt();
        }
    }
}
