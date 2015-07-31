
import java.util.Scanner;

public class NearlyLuckyNumber110A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String str = in.next();

        if (IsItLucky(str)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

        in.close();
    }

    public static boolean IsItLucky(String str) {
        int l     = str.length();
        int count = 0;

        for (int i=0; i<l; i++) {
            char c = str.charAt(i);

            if (c == '4' || c == '7'){
                count++;
            }
        }
        if (count == 4 || count == 7){
            return true;
        }
        else {
            return false;
        }
    }
}
