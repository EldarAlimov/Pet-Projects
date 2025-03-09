import java.util.*;

public class URI1239 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<String> L = new ArrayList<String>();
        int s = 0;
        while(in.hasNextLine()){
            L.add(in.nextLine());
            s++;
        }
        for (int i = 0; i < s; i++) {
            L.set(i, replace1(L.get(i)));
            L.set(i, replace2(L.get(i)));
            System.out.println(L.get(i));
        }

    }
    static String replace1(String S){
        int d = 1;
        while(S.contains("_")){
            if(d%2 == 1){
                S = S.replaceFirst("_", "<i>");

            } else {
                S = S.replaceFirst("_", "</i>");
            }
            d++;
        }
        return S;
    }
    static String replace2(String S){
        int d = 1;
        while(S.contains("*")){
            if(d%2 == 1){
                S = S.replaceFirst("\\*", "<b>");

            } else {
                S = S.replaceFirst("\\*", "</b>");
            }
            d++;
        }
        return S;
    }
}
