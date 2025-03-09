public class Problem01 {
    public static void main(String[] args) {
        double eps = 0.000000000000001;
        double a = 2/3.0;
        double b = 2.0;
        double c = a + a + a;
        System.out.println(Math.abs(b - c) < eps);
    }
}
