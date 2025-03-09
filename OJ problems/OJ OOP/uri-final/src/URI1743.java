import java.util.Arrays;
import java.util.Scanner;

public class URI1743 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] testArray = {1, 1, 1, 1, 1};
        int[][] mainArray = new int[2][5];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                mainArray[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            mainArray[0][i]+=mainArray[1][i];
        }
        if(Arrays.equals(mainArray[0], testArray)) System.out.println("Y");
        else System.out.println("N");
    }
}
