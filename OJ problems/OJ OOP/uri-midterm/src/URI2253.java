import java.util.Scanner;
import java.util.regex.Pattern;

public class URI2253 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){

            String s = in.nextLine();
            boolean f = true;
            if (s.length()<6 | s.length()>32){
                printI();
                continue;
            }
            if (Pattern.matches("\\p{Punct}", s)){
                printI();
                continue;
            }
            boolean up = false;
            boolean lw = false;
            boolean nm = false;
            for (int i = 0; i < s.length(); i++) {
                if(Character.isUpperCase(s.charAt(i))) up = true;
                if(Character.isLowerCase(s.charAt(i))) lw = true;
                if(Character.isDigit(s.charAt(i))) nm = true;
            }
            if (!(up && lw && nm)){
                printI();
                continue;
            }
            printV();
        }
    }
    static void printV(){
        System.out.println("Senha valida.");
    }
    static void printI(){
        System.out.println("Senha invalida.");
    }
}
