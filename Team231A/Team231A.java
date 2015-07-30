
import java.util.Scanner;

public class Team231A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int total = 0;
        for(int i=0; i<n; i++){
            int count = 0;
            for (int j=0; j<3; j++){
                count += in.nextInt();
            }
            if (count > 1) {
                total++;
            }
        }
        System.out.println(total);
    }
}
