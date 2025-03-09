import java.util.Random;

public class Problem10 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int r = rnd.nextInt(13) + 1;
        int s = rnd.nextInt(4);
        String rs = "";
        String ss = "";
        switch(r){
            case 1:
                rs = "Ace";
                break;
            case 11:
                rs = "Jack";
                break;
            case 12:
                rs = "Queen";
                break;
            case 13:
                rs = "King";
                break;
            default:
                rs = String.valueOf(r) ;
        }
        switch(s){
            case 0:
                ss = "Clubs";
                break;
            case 1:
                ss = "Diamonds";
                break;
            case 2:
                ss = "Hearts";
                break;
            case 3:
                ss = "Spades";
                break;
        }
        System.out.println("The card you picked is " + rs + " of " + ss);

    }
}
