import java.util.Scanner;

public class PetyaAndStrings112A{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        String first  = in.next();
        String second = in.next();

        first  = first.toLowerCase();
        second = second.toLowerCase();

        int ans = first.compareTo(second);
        if (ans > 0){
            ans = 1;
        }
        else if (ans < 0) {
            ans = -1;
        }
        System.out.println(ans);
    }
}
