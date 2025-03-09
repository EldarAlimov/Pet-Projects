import java.util.Locale;
import java.util.Scanner;

public class URI1305 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Locale.setDefault(Locale.US);
        while(in.hasNextLine()){
            String num = in.nextLine();
            String d = in.nextLine();
            d = "0" + d + "0";
            double c = Double.parseDouble(d);
            int n1 = 0;
            double n2 = 0;
            if(num.contains(".")){
                int i = num.indexOf('.');
                if (num.substring(0, i).length()>0) n1 = Integer.parseInt(num.substring(0, i));
                if (num.substring(i).length()>1) n2 =Double.parseDouble("0" + num.substring(i));
            }
            else{
                n1 = Integer.parseInt(num);
            }

            if (n2 > c){
                n1++;
            }
            System.out.println(n1);
        }
    }
}
