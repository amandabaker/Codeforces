
import java.util.Scanner;

public class StringTask118A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        str = str.toLowerCase();
        String newStr = "";

        for (int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            switch (c){
            case 'a': break;
            case 'e': break;
            case 'i': break;
            case 'o': break;
            case 'u': break;
            case 'y': break;
            default:  newStr += "." + str.substring(i,i+1);
            }
        }
        System.out.println(newStr);
    }
}
