import java.util.Scanner;

public class URI2651 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.toLowerCase();
        if(s.contains("zelda")){
            s = "Bolado";
        }
        else{
            s = "Tranquilo";
        }
        System.out.println("Link " + s);
    }
}
