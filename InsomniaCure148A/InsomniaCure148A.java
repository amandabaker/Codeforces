
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

        // keep track of injured dragons
        int count = 0;
        for (int i=1; i<=d; i++) {
            if (i%k == 0 || i%l == 0 || i%m == 0 || i%n == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
