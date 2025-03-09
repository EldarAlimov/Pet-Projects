import java.util.Scanner;

public class URI1235 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
        String str = readLine(in);
        StringBuilder parte1 = new StringBuilder(str.substring(0, str.length() / 2));
        StringBuilder parte2 = new StringBuilder(str.substring(str.length() / 2));
        parte1.reverse();
        parte2.reverse();
        System.out.println(parte1.toString() + parte2.toString());
        }
    }

        public static String readLine(Scanner in) {
            String line = in.nextLine();
            while (line.isEmpty())
                line = in.nextLine();
            return line;
        }

}