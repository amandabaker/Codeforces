
import java.util.Scanner;

public class Tram116A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int total = 0;
        int max   = 0;
                       
        for (int i=0; i<n; i++) {
            total -= in.nextInt();
            total += in.nextInt();
            if (total > max) {
                max = total;
            }
        }
        System.out.println(max);
    }
}
