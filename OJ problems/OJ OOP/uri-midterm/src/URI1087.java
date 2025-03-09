import java.util.Objects;
import java.util.Scanner;

public class URI1087 {
    static int[][] board = new int[8][8];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String[] s = new String[4];
        s = in.nextLine().split(" ");
        while(!Objects.equals(s[0], "0")){
            nullify();
            int x1 = Integer.parseInt(s[0])-1;
            int y1 = Integer.parseInt(s[1])-1;
            int x2 = Integer.parseInt(s[2])-1;
            int y2 = Integer.parseInt(s[3])-1;
            board[x1][y1] = 2;
            mark1(x1, y1);
            mark2(x1, y1);
            if(x1==x2 && y1==y2){
                System.out.println(0);
            }
            else{
                if(board[x2][y2] > 0) System.out.println(1);
            else {
                    if (board[x2][y2] == 0) {
                        System.out.println(2);
                    }
                }
            }
            s = in.nextLine().split(" ");
            nullify();
        }
    }
    static void display(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + "     ");
            }
            System.out.println();
        }
    }
    static void mark1(int x1, int y1){
        for (int i = 0; i < 8; i++) {
            board[x1][i]+=1;
            board[i][y1]+=1;
        }
    }
    static void mark2(int x1, int y1){
        for (int i = 0; i < 8; i++) {
            if (check(x1+i, y1+i)){
                board[x1+i][y1+i]+=10;
            }
            if (check(x1-i, y1+i)){
                board[x1-i][y1+i]+=10;
            }
            if (check(x1+i, y1-i)){
                board[x1+i][y1-i]+=10;
            }
            if (check(x1-i, y1-i)){
                board[x1-i][y1-i]+=10;
            }
        }
    }
    static void nullify(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = 0;
            }
        }
    }
    static boolean check(int x, int y){
        if (x >= 0 && x < 8 && y >= 0 && y < 8){
            return true;
        }
        return false;
    }
    
}
