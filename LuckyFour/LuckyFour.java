import java.util.Scanner;

public class LuckyFour {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0; i<T; i++){
            int count = 0;
            int num = in.nextInt();
            boolean done = false;
            while (!done){
                if (num % 10 == 4){
                    count++;
                }
                num = num / 10;
                if (num == 0){
                    done = true;
                }
            }
            System.out.println(count);
        }
    }
}
