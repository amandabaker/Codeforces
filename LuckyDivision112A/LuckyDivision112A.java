
import java.util.Scanner;

public class LuckyDivision112A{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (AlmostLucky(n)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

        in.close();
    }

    public static boolean AlmostLucky(int n) {
        //  %4==0  -->    44, 444, 744
        //  %7==0  -->    77, 777

        //  full list:
        //  4,   7,  44,  47,  74,  77, 444, 447, 474, 477, 744, 747, 774, 777

        //  simplified list:
        //  4,   7,       47,  74,           447, 474, 477,      747, 774

        if      (n %   4 == 0) return true;
        else if (n %   7 == 0) return true;
        else if (n %  47 == 0) return true;
        else if (n % 447 == 0) return true;
        else if (n % 474 == 0) return true;
        else if (n % 477 == 0) return true;
        else if (n % 747 == 0) return true;
        else if (n % 774 == 0) return true;
        else                   return false;
    }
}
