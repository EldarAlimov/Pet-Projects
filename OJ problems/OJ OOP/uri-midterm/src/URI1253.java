import java.util.Scanner;

public class URI1253 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.next());
        String[][] L = new String[n][2];
        int shift = 0;

        for (int i = 0; i < n; i++) {
            L[i][0] = in.next();

            L[i][1] = in.next();
            shift = Integer.parseInt(L[i][1]);
            for (int j = 0; j < L[i][0].length(); j++) {

                int g = ((int)L[i][0].charAt(j) - shift);
                while(g<65){
                    g+=26;
                }
                char c = (char)g;
                L[i][0] = L[i][0].substring(0, j) + c + L[i][0].substring(j+1);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(L[i][0]);
        }
    }
}
