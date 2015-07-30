
import java.util.Scanner;

public class NextRound158A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int ans = 0;
        int score = 0;
        for (int i=1; i<=n; i++){
            int temp = in.nextInt();
            if (temp <= 0){
                break;
            }
            else if (i == k){
                score = temp;
            }
            else if (i>k && temp < score){
                break;
            }
            ans++;
        }
        System.out.println(ans);
    }
}
