import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sx = 0;
        int bx = 100;
        int sy = 0;
        int by = 100;
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String a = in.next();
            String[] A = a.split(",");
            if (Integer.valueOf(A[0]) > sx){
                sx = Integer.valueOf(A[0]);
            }
            if (Integer.valueOf(A[0]) < bx){
                bx = Integer.valueOf(A[0]) ;
            }
            if (Integer.valueOf(A[1]) > sy){
                sy = Integer.valueOf(A[1]);
            }
            if (Integer.valueOf(A[1]) < by){
                by = Integer.valueOf(A[1]);
            }
        }
        System.out.println((bx-1)+","+(by-1));
        System.out.println((sx+1)+","+(sy+1));
    }
}
