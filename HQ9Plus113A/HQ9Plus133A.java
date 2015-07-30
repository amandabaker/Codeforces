import java.util.Scanner;

public class HQ9Plus133A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(WillProduceOutput(str));
    }

    public static String WillProduceOutput(String str) {
        int l = str.length();

        for (int i=0; i<l; i++){
            char c = str.charAt(i);
            if (c == 'H' || c == 'Q' || c == '9') {
                return "YES";
            }
        }
        return "NO";
    }
}
