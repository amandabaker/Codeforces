import java.util.Scanner;

public class LuckyNumber{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0; i<T; i++){
            int N = in.nextInt();
            // N = abs(N);
            if (isPrime(N)){
                System.out.println("LUCKY NUMBER");
            }
            else {
                System.out.println("Sorry");
            }
        }
    }

    public static boolean isPrime(int n){
        /*
        if (n < 0) {
            return false;  //assume no negative numbers
        }
        */
        if (n%2 == 0){
            return false;
        }
        if (n == 1){
            return true;
        }
        for (int i=3; i*i<=n; i+=2){
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}

/*
   Runs fine with the example input, but fails to work with all inputs
 */
