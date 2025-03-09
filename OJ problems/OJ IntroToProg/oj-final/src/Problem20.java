import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wcount = 0;
        for (int i = 0; i < 6; i++) {
            String game = scanner.nextLine();
            if(game.equals("W")){
                wcount++;
            }
        }
        switch (wcount){
            case 5,6 -> System.out.println(1);
            case 3,4 -> System.out.println(2);
            case 1,2 -> System.out.println(3);
            default -> System.out.println(-1);
        }
    }
}
