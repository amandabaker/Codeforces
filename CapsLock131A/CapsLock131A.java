
import java.util.Scanner;

public class CapsLock131A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();

        //  if its only one character long
        if (str.length() == 1) {
            ChangeCase(str);
            /*if ((int)str.charAt(0) >= 97){
                ChangeCase(str);
            }
            else {
                System.out.println(str);
                }*/
        }
        //  if its 2 characters or more
        else if (str.length() > 1) {
            //  if the first letter is lowercase...
            if ((int)str.charAt(0) >= 97){
                //  ...make sure all the rest are capitalized
                boolean allCaps = true;
                for (int i=1; i<str.length(); i++){
                    if ((int)str.charAt(i) >= 97) {
                        allCaps = false;
                    }
                }

                //  then print accordingly
                if (allCaps == true) {
                    ChangeCase(str);
                }
                else {
                    System.out.println(str);
                }
            }
            //  if the first letter is capitalized
            else {
                boolean allCaps = true;
                for (int i=0; i<str.length(); i++) {
                    if ((int)str.charAt(i) >= 97) {
                        allCaps = false;
                    }
                }
                if (allCaps == true) {
                    ChangeCase(str);
                }
                else {
                    System.out.println(str);
                }
            }
        }
    }

    public static void ChangeCase (String str) {
        for (int i=0; i<str.length(); i++){
            int c = (int)str.charAt(i);
            if (c >= 97){
                System.out.print((char)(c-32));
            }
            else {
                System.out.print((char)(c+32));
            }
        }
    }
} 
