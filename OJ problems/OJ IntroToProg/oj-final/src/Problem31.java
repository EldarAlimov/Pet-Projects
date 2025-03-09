import java.util.Scanner;

public class Problem31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int e = in.nextInt();
        while (s <= e){
            if (sumCubes(s) == s) System.out.println(s);
            s++;
        }
    }
    public static int sumCubes(int a){
        int b = 0;
        while (a > 0){
            b+=Math.pow(a%10, 3);
            a/=10;
        }
        return b;
    }
}


