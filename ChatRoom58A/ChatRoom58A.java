
import java.util.Scanner;

public class ChatRoom58A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.print(DidHeSayHello(str));
    }

    public static String DidHeSayHello(String str){
        int l = str.length();

        //does it have an h? if so where? if not, return "NO"
        //after the h, does it have an e? if so where? if not, return "NO"

        int hIndex  = str.indexOf('h');
        int eIndex  = str.indexOf('e', hIndex+1);
        int lIndex  = str.indexOf('l', eIndex+1);
        int l2Index = str.indexOf('l', lIndex+1);
        int oIndex  = str.indexOf('o', l2Index+1);
        //  if there is no h, return NO
        if      (hIndex < 0){
            return "NO";
        }
        else if (eIndex < 0){
            return "NO";
        }
        else if (lIndex < 0){
            return "NO";
        }
        else if (l2Index < 0) {
            return "NO";
        }
        else if (oIndex < 0) {
            return "NO";
        }
        return "YES";
    }
}
