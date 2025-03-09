import java.util.Scanner;

public class URI1024 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //INIT
        int n = in.nextInt();
        String[] l = new String[n+1];

        for (int i = 0; i < n+1; i++) {
            l[i] = in.nextLine();
            //STEP 1
            for (int j = 0; j < l[i].length(); j++) {
                if(((int)l[i].charAt(j) > 64 && (int)l[i].charAt(j) <= 90) || ((int)l[i].charAt(j) >96 && (int)l[i].charAt(j) <= 122)){
                    l[i] = l[i].substring(0, j) + (char)((int)l[i].charAt(j)+3) + l[i].substring(j+1);
                }
            }
            //STEP 2
            char c;
            String ns = "";
            for (int j = 0; j < l[i].length(); j++) {
                c = l[i].charAt(j);
                ns = c + ns;
            }
            l[i] = ns;

            //STEP 3
            for (int j = (l[i].length()/2); j < l[i].length(); j++) {
                l[i] = l[i].substring(0, j) + (char)((int)l[i].charAt(j)-1) + l[i].substring(j+1);

            }
        }
        for (int i = 1; i < n+1; i++) {
            System.out.println(l[i]);
        }

    }
}
