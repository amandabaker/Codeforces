
import java.util.Scanner;

public class Bit282A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = 0;   
        for (int i=0; i<n; i++) {
            String str = in.next();
            char a = str.charAt(0);
            if (a == '-') {
                x--; continue;
            }
            else if (a == '+') {
                x++; continue;
            }

            char b = str.charAt(1);
            if (b == '-') {
                x--; continue;
            }
            else {
                x++; continue;
            }
        }
        System.out.println(x);
    }
}
