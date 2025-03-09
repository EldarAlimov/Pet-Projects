import java.util.Arrays;
import java.util.Scanner;

public class URI1383 {
    static boolean f = true;
    static int[] T = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][][]  A = new int[n][9][9];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    A[i][j][k] = in.nextInt();
                }
            }
            int[][] a = new int[9][9];
            a = A[i];
            Ch_mas(a);
            System.out.println("Instancia " + i);
            if(f) System.out.println("SIM");
            else System.out.println("NAO");
            f = true;
        }

    }
    public static void Ch_mas(int[][]A){
        Ch_hor(A);
        //System.out.println("hor " + f);
        Ch_ver(A);
        //System.out.println("ver " + f);
        Ch_hor(Con(A));
        //System.out.println("con " + f);
    }

    public static void Ch(int[] A){
        int[] d = new int[9];
        System.arraycopy(A, 0, d, 0, 9);
        Arrays.sort(d);
        if(!Arrays.equals(d, T)){
            //Display(A);
            f = false;
        }

    }
    public static void Ch_hor(int[][] A){
        //Horizontal
        for (int i = 0; i < 9; i++) {
            int[] a = A[i];
            Ch(a);
        }
    }
    public static void Ch_ver(int[][]A){
        //Vertical
        for (int i = 0; i < 9; i++) {
            int[] a = new int[9];
            for (int j = 0; j < 9; j++) {
                a[j] = A[j][i];
            }
            Ch(a);
        }
    }
    public static int[][] Con(int[][] A){
        int[][] a = new int[9][9];
        int x = 0;
        int y = 0;
        int I = 0;
        int J = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        a[I][J]= A[y+k][x+l];
                        J++;
                        if(J==9) J=0;
                    }
                }
                I++;
                x+=3;
                if(x==9) x = 0;
            }
            y+=3;
            if(y == 9) y = 0;
        }
        return a;
    }

    public static void Display(int[] A){
        for (int j = 0; j < 9; j++) {
            System.out.print(A[j] + " ");
        }
        System.out.println();
    }
}
