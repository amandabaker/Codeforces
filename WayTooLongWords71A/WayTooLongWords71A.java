
import java.util.Scanner;

public class WayTooLongWords71A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=0; i<n; i++){
            String str = in.next();
            if (str.length() <= 10){
                System.out.println(str);
            }
            else{
                String abbrv = "";
                int l = str.length();
                abbrv = str.substring(0,1) + Integer.toString(l-2)
                        + str.substring(l-1,l);
                System.out.println(abbrv);
            }
        }
    }
}
