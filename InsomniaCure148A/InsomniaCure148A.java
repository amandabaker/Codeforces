
import java.util.Scanner;

public class InsomniaCure148A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // the _th dragons are injured
        int k = in.nextInt();
        int l = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        // number of dragons total
        int d = in.nextInt();

        //boolean[] unfortunateDragons = new boolean[d];

        // keep track of injured dragons
        int count = 0;
        for (int i=0; i<d; i++) {
            if (d%k == 0 || d%l == 0 || d%m == 0 || d%n == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
