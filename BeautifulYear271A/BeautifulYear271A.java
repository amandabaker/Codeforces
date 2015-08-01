/*
   THIS IS ALL WRONG REDO IT
 */

import java.util.Scanner;

public class BeautifulYear271A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int baseYear = in.nextInt();
        baseYear++;

        int k = (baseYear       ) / 1000;
        int h = (baseYear % 1000) / 100;
        int d = (baseYear % 100 ) / 10;
        int o = (baseYear % 10  ) / 1;

        if (k == h){
            h++;
        }

        if (k == d){
            d++;
        }
        if (h == d){
            d++;
            if (k == d) {
                d++;
            }
        }

        if (k == o){
            o++;
        }
        if (h == o){
            o++;
            if (k == 0) {
                o++;
            }
        }
        if (d == o){
            o++;
            if (k == o) {
                o++;
            }
            if (h == o){
                o++;
                if (k == o) {
                    o++;
                }
            }
        }
        String str = "";
        str += k;
        str += h;
        str += d;
        str += o;
        System.out.println(str);

        in.close();
    }
}
