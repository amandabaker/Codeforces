import java.util.Scanner;

public class WordCapitalization281A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        str.append(in.next());
        if (str.length() > 0 && str.charAt(0) >= 'a') {
            String addition = Character.toString((char)(str.charAt(0) - 32));
            str.replace(0,1,addition);
        }
        System.out.println(str);
    }
}
