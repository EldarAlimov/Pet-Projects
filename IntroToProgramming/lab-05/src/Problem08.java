
public class Problem08 {
    public static void main(String[] args) {
        System.out.print("   ");
        for (int i = 1; i < 10; i++) {
            System.out.print("  " + i);
        }
        System.out.println();
        System.out.println("-------------------------------");
        for (int i = 1; i < 10; i++) {

            System.out.print(i+ " | ");
            for (int j = 1; j < 10; j++) {

                if(i*j<10){
                    System.out.print(" " + i*j + " ");
                }
                else{
                    System.out.print(i*j + " ");
                }
            }
            System.out.println();
        }
    }
}
