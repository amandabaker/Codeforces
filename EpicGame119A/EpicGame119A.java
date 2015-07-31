
import java.util.Scanner;

public class EpicGame119A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int simon     = in.nextInt();
        int antisimon = in.nextInt();
        int numStones = in.nextInt();
        boolean done  = false;
        // TEMPORARY TO SKIP WHILE LOOP
        done = true;

        while (!done) {
            // Simon's hand
            
            //if not done, then antisimon's hand
        }

        // test gcf
        System.out.println(GCF(simon, antisimon));
    }

    public static int GCF (int a, int b) {
        int r = 1;

        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (r > 0) {
            // int q = a / b;
            r = a % b;
            a = b;
            b = r;
            
        }
        return a;
    }
}
