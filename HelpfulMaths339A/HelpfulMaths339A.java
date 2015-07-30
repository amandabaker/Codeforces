import java.util.Scanner;
import java.util.Arrays;

public class HelpfulMaths339A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        OrderedMath(str);
    }

    public static void OrderedMath (String str) {

        int l = (int)Math.ceil(str.length()/2.0);
        int numbers[] = new int[l];
        int j = 0;
        for (int i=0; i<str.length(); i=i+2) {
            numbers[j++] = str.charAt(i) - 48;
        }
        Arrays.sort(numbers);
        for(int i=0; i<l-1; i++){
            System.out.print(numbers[i] + "+");
        }
        System.out.println(numbers[l-1]);
    }
}
