import java.util.Scanner;
import java.util.Arrays;

public class Twins160A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n               = in.nextInt();
        int[] nums            = new int[n];

        for (int i=0; i<n; i++){
            nums[i] = in.nextInt();
        }            
        Arrays.sort(nums);

        int myMoney         = nums[n-1];
        int myPosition      = n - 1;
        int myTwinsMoney    = 0;
        int myTwinsPosition = 0;

        while (myPosition > myTwinsPosition ){
            // if I have more money he gets the smallest coin
            if (myTwinsMoney < myMoney &&
                myTwinsMoney + nums[myTwinsPosition] < myMoney) {
                myTwinsMoney += nums[myTwinsPosition++];
            }
            // if I have more money I get the Largest coin
            else {
                myMoney += nums[--myPosition];
            }
        }
        System.out.println(n-myPosition);
        //System.out.println("n: " + n);
        //System.out.println("myPosition: " + myPosition);

        
    }
}
