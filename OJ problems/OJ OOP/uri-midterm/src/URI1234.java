import java.util.Scanner;

public class URI1234 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()){
            boolean flag = true;
            StringBuilder S = new StringBuilder(in.nextLine());

            for (int i = 0; i < S.length(); i++) {
                char c = S.charAt(i);
                if (Character.isAlphabetic(c)) {
                    if (flag) 	S.setCharAt(i, Character.toUpperCase(c));
                    else 		S.setCharAt(i, Character.toLowerCase(c));
                    flag =! flag;
                }

            }
            System.out.println(S);
        }
    }
}
