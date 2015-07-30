import java.util.Scanner;

public class FitSquaresInTriangle{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0; i<T; i++){
            int B = in.nextInt();
            int num = (B-2)/2;
            int sum = 0;
            for (int j=1; j<=num; j++){
                sum += j;
            }
            System.out.println(sum);
        }
    }
 }
