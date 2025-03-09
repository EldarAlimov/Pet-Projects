import java.util.Random;
import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int a = rand.nextInt(3);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int b = in.nextInt();
        if (b != 0 &&b != 1 && b != 2){
            System.out.println("Ты тупой клоун");
            return;
        }
        int d = 3;
        String com = "", hum = "";
        switch(a){
            case 0:
                com = "scissor";
                break;
            case 1:
                com = "rock";
                break;
            case 2:
                com = "paper";
                break;
        }
        switch(b){
            case 0:
                hum = "scissor";
                break;
            case 1:
                hum = "rock";
                break;
            case 2:
                hum = "paper";
                break;
        }
        if ((a == 0 && b == 1) || (a == 1 && b ==2) ||(a == 2 && b ==0)){
            System.out.println("The computer is " + com + ". You are " + hum + ". You won");
        }
        else {
            if ((a == 0 && b == 2) || (a == 1 && b == 0) || (a == 2 && b == 1)){
                System.out.println("The computer is " + com + ". You are " + hum + ". You lost");
            }
            else {
                System.out.println("The computer is " + com + ". You are " + hum + ". It is a draw");
            }
        }


    }
}
