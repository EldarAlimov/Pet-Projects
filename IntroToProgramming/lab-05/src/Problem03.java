import java.util.Random;
import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Number of tests? ");
        int cor = 0;
        int inc = 0;
        int n = in.nextInt();
        while (n > 0){
            int a = rnd.nextInt(-20,20);
            int b = rnd.nextInt(-20,20);
            System.out.print(a + " + " + b + " = ");
            int c = in.nextInt();
            if (a + b == c){
                cor +=1;
            }
            else{
                inc +=1;
            }
            n-=1;
        }
        System.out.println("Number of correct answers: " + cor);
        System.out.println("Number of incorrect answers: " + inc);

    }
}
