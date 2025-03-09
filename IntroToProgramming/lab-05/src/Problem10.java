public class Problem10 {
    public static void main(String[] args) {
        int a = 2;
        boolean f = true;
        for (int i = 0; i < 50; i++) {
            System.out.print(a + " ");

            f = false;
            while(!f){
                a = a + 1;
                f = true;
                double g = Math.sqrt(a);
                int d = (int)g + 1;
                for (int j = 2; j <= d; j++) {
                    if (a % j == 0) {
                        f = false;
                        break;
                    }
                }

            }

        }
    }
}
