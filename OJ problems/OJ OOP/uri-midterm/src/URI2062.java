import java.util.Scanner;

public class URI2062 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] S = new String[n];
        String s = in.nextLine();
        S = s.split("\\s");
        for (int i = 0; i < S.length; i++) {
            if(S[i].length() == 3 & S[i].charAt(0) == 'O' & S[i].charAt(1) == 'B') S[i] = "OBI";
            else if (S[i].length() == 3 & S[i].charAt(0) == 'U' & S[i].charAt(1) == 'R') S[i] = "URI";
        }
        System.out.print(S[0]);
        for (int i = 1; i < S.length; i++) {
            System.out.print(" " + S[i]);
        }
        System.out.println();

    }
}
