
import java.util.Scanner;

public class StonesOnTheTable266A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String colors = in.next();
        System.out.println(RemoveFromTable(colors));
    }

    public static int RemoveFromTable(String colors) {
        int l = colors.length();
        int count = 0;
        char thisChar = ' ';
        char lastChar = colors.charAt(0);

        if (l < 2) {
            return 0;
        }
        for (int i=1; i<l; i++){
            thisChar = colors.charAt(i);
            if (thisChar == lastChar){
                count++;
            }
            lastChar = thisChar;
        }
        return count;
    }
}
