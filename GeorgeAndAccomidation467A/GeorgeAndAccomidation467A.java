
import java.util.Scanner;

public class GeorgeAndAccomidation467A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n     = in.nextInt();
        int count = 0;

        for (int i=0; i<n; i++) {
            int taken = in.nextInt();
            int total = in.nextInt();
            if (total-taken >= 2) {
                count++;
            }
        }

        System.out.println(count);
        in.close();
    }
}
