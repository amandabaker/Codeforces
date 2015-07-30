
import java.util.Scanner;

public class TheaterSquare1A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        long m = in.nextInt();
        long a = in.nextInt();
        long n2 = n%a==0 ? n/a : n/a+1;
        long m2 = m%a==0 ? m/a : m/a+1;
        long numSq = n2 * m2;
        System.out.println(numSq);
    }
}
