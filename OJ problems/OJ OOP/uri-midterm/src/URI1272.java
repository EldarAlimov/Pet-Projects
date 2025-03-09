import java.util.Scanner;

public class URI1272 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String st = in.next();
            st= st.replaceAll("·*", " ");
            st = st.trim();
            String[] l = st.split(" ");

            for (int j = 0; j < l.length; j++) {
                if (!l[j].isEmpty()) System.out.print(l[j].charAt(0));
            }
            System.out.println();
        }
    }
}
