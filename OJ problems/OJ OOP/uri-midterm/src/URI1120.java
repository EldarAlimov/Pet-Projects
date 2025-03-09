import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class URI1120 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        boolean flag = true;
        List<String> ls = new ArrayList<String>();
        do{
            String a = in.nextLine();
            String[] L = a.split("\\s");
            String out = L[1].replaceAll(L[0], "");
            out = out.replaceFirst("0*" , "");
            if (out.length() == 0) ls.add("0");
            else ls.add(out);

            if (Objects.equals(L[0], "0")) flag = false;
        }while(flag);
        for (int i = 0; i < ls.size()-1; i++) {
            System.out.println(ls.get(i));
        }
    }
}
