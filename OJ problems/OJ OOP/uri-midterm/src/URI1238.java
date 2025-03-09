import java.util.Scanner;

public class URI1238 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[][] L = new String[n+1][2];
        for (int i = 0; i < n+1; i++) {
            L[i] = in.nextLine().split(" ");
        }
        for (int i = 1; i < n+1; i++) {
            int s = 0;
            for (int j = 0; j < Math.min(L[i][0].length(), L[i][1].length()); j++) {
                System.out.print(L[i][0].charAt(j));
                System.out.print(L[i][1].charAt(j));
                s++;
            }

            if (L[i][0].length()==s) {
                for (int j = s; j < L[i][1].length(); j++) {
                    System.out.print(L[i][1].charAt(j));
                }
            }else{
                for (int j = s; j < L[i][0].length(); j++) {
                    System.out.print(L[i][0].charAt(j));
                }
            }
            System.out.println();
        }
    }
}
