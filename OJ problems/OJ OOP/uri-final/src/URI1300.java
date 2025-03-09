import java.util.Scanner;

public class URI1300 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int a = in.nextInt();
            if (a%6==0){
                System.out.println("Y");
            }else{
                System.out.println("N");
            }
        }
    }
}
