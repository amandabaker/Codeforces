
import java.util.Scanner;

public class EpicGame119A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int simon        = in.nextInt();
        int antisimon    = in.nextInt();
        int numStones    = in.nextInt();
        int winner       = 1;            //assumes simon did NOT win

        while (numStones > 0) {
            // Simon's turn
            numStones -= GCF (simon, numStones);


            // if there are no stones, then simon won
            if (numStones == 0) {
                winner = 0;
                break;
            }

            // otherwise its antisimon's turn
            numStones -= GCF (antisimon, numStones);
        }

        System.out.println(winner);
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
