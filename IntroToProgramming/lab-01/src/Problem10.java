public class Problem10 {
    public static void main(String[] args) {
        double p = 312032486;
        double b = 365*24*60*60/7.0;
        double d = 365*24*60*60/13.0;
        double im = 365*24*60*60/45.0;
        for (int i = 1; i <=5; i++){
            p = p + b + im - d;
            System.out.println("after " + i + " years - " + (int)(p-(p)%1));
        }
    }
}