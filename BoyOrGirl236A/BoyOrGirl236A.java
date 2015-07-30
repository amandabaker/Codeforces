import java.util.Scanner;
import java.util.Arrays;

public class BoyOrGirl236A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();

        CheckBoyOrGirl(name);
    }

    public static void CheckBoyOrGirl(String name) {
        int l     = name.length();
        int count = 0;
        boolean[] lettersUsed = new boolean[26];
        Arrays.fill(lettersUsed, Boolean.FALSE);

        //  mark which letters were used
        for (int i=0; i<l; i++){
            int n = ((int)name.charAt(i)-97);
            lettersUsed[n] = true;
        }

        //  count how many letters were used
        for (int i=0; i<26; i++) {
            if (lettersUsed[i] == true) {
                count++;
            }
        }

        //  if even then girl
        if (count % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        }

        //  if odd then boy
        else {
            System.out.println("IGNORE HIM!");
        }
    }
}
