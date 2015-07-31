
import java.util.Scanner;

public class DoubleCola82A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n        = in.nextInt();
        int exponent = 0;
        int count    = 1;

        while (n > 5 * Math.pow(2,exponent)) {
            n -= 5 * Math.pow(2,exponent);
            exponent++;
        }

        while (n > Math.pow(2,exponent)) {
            n -= Math.pow(2,exponent);
            count++;
        }

        switch (count) {
        case 1: System.out.println("Sheldon");
            break;
        case 2: System.out.println("Leonard");
            break;
        case 3: System.out.println("Penny");
            break;
        case 4: System.out.println("Rajesh");
            break;
        case 5: System.out.println("Howard");
            break;
        default:
            break;
        }
    }
}
