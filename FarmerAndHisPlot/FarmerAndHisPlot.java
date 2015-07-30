
import java.util.Scanner;


public class FarmerAndHisPlot{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0; i<T; i++){
            int M = in.nextInt();
            int N = in.nextInt();
            int gcf = GCF(M, N);
            int minSq = (M/gcf) * (N/gcf);
            System.out.println(minSq);
        }
    }

    public static int GCF (int m, int n){
        int min = Math.min(m, n);
        int max = Math.max(m, n);
        for (int i=1; i<min; i++){
            if (min%i == 0  &&  max%(min/i) == 0){
                return min/i;
            }
        }
        return 1;
    }
}
