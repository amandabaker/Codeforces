/*
   THIS IS ALL WRONG REDO IT
 */

import java.util.Scanner;

public class BeautifulYear271A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int baseYear = in.nextInt();
        baseYear++;

        while (!DifferentDigits(baseYear)){
            baseYear++;
        }

        System.out.println(baseYear);
        in.close();
    }

    /*
      Checks to see if the digits are all different
     */
    public static boolean DifferentDigits(int year) {
        int k = year / 1000;
        int h = (year % 1000) / 100;
        int d = (year % 100 ) / 10;
        int o = (year % 10  ) / 1;

        if (k == h || k == d || k == o || h == d || h == o || d == o) {
            return false;
        }

        return true;
    }
}
