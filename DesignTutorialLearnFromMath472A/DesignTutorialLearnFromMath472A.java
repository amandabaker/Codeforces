
import java.util.Scanner;

public class DesignTutorialLearnFromMath472A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        //  if its even, then you can do n / 2 +/- 1 or ANY even numbers

        // if its odd, use 9 and whatever is left

        int x = 0;
        int y = 0;
        if (n % 2 == 0) {
            int half = n/2;
            if (half % 2 == 0) {
                x = half - 2;
                y = half + 2;
            }
            else {
                x = half - 1;
                y = half + 1;
            }
        }
        else {
            x = 9;
            y = n - 9;

            if (x > y) {
                int temp = x;
                x = y;
                y = temp;
            }
        }


        System.out.println(x + " " + y);

        in.close();
    }
}
