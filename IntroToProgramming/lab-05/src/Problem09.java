
import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a  string: ");
        String s = in.nextLine();
        String f = "";
        for (int i = 0; i < s.length()/2 ; i++) {
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                f = " not";
            }
        }
        System.out.print(s + " is" + f + " a palindrome");

    }
}
