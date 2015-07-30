import java.util.Scanner;

public class Football96A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String players = in.next();

        if (DangerousSituation(players)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    public static boolean DangerousSituation(String players) {
        
        int l          = players.length();
        int thisChar   = ' ';
        int lastChar   = players.charAt(0);
        int count      = 1;
        for (int i=1; i<l; i++){
            thisChar = players.charAt(i);

            if (thisChar == lastChar) {
                count++;
                if (count >= 7) {
                    return true;
                }
            }
            else {
                count = 1;
            }
            lastChar = thisChar;
        }
        return false;
    }
}
