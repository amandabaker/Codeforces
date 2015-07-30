
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Taxi158B {
    /*public static void main(String[] args){
        int maxSeats = 4;
        int numTaxi = 0;
        boolean has1 = true;
        boolean has2 = true;

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> groups = new ArrayList<Integer>(n);
        for (int i=0; i<n; i++){
            groups.add(in.nextInt());
        }
        int groupSize = 4;
        while (groups.size() > 0){ //while there are elements in the arraylist

            int index = groups.indexOf(groupSize);
            if (index >= 0){
                groups.remove(index);
            }
            else {
                groupSize--;
                continue;
            }

            if (groupSize == maxSeats){
                numTaxi++;
            }
            else if (groupSize == 3 && has1 == false){
                numTaxi++;
            }
            else{
                int seatsLeft = maxSeats - groupSize;
                int newGroup = Math.min(seatsLeft, groupSize);
                while(seatsLeft != 0 && newGroup > 0){
                    int indx = groups.indexOf(newGroup);
                    if (indx >= 0){
                        groups.remove(indx);
                        seatsLeft -= newGroup;
                    }
                    else {
                        if (newGroup == 1) {
                            has1 = false;
                        }
                        else if (newGroup == 2) {
                            has2 = false;
                        }
                        newGroup--;
                    }
                }
                numTaxi++;
            }
        }
        System.out.println(numTaxi);
    }
    */

    public static void main(String[] args){
        int numTaxi = 0;
        //int groupSize = 4;

        Scanner in = new Scanner(System.in);
        int numGroups = in.nextInt();
        ArrayList<Integer> groups = new ArrayList<Integer>(numGroups);
        for (int i=0; i<numGroups; i++){
            groups.add(in.nextInt());
        }

        //  Sort the arraylist
        Collections.sort(groups);

        while (groups.size() > 0) {
            //get last(largest) element in arraylist
            int len = groups.size();
            int thisGroupSize = groups.get(len-1);
            groups.remove(len-1);

            if (thisGroupSize == 4){
                numTaxi++;
            }
            else if (len >= 2 && thisGroupSize == 3 && groups.get(0) == 1){

                groups.remove(0);
                numTaxi++;
            }
            else if (thisGroupSize == 3){

                numTaxi++;
            }
            else if (len >= 2 && thisGroupSize == 2 && groups.get(len-2) == 2){

                groups.remove(len-2);
                numTaxi++;
            }
            else if (len >= 3 && thisGroupSize == 2 && groups.get(0) == 1
                                                   && groups.get(1) == 1) {
                groups.remove(1);
                groups.remove(0);
                numTaxi++;
            }
            else if (len >= 2 && thisGroupSize == 2 && groups.get(0) == 1) {

                groups.remove(0);
                numTaxi++;
            }
            else if (thisGroupSize == 2) {

                numTaxi++;
            }
            else if (len >= 4 && thisGroupSize == 1 && groups.get(0) == 1
                                                   && groups.get(1) == 1
                                                   && groups.get(2) == 1) {
                groups.remove(2);
                groups.remove(1);
                groups.remove(0);
                numTaxi++;
            }
            else if (len >= 3 && thisGroupSize == 1 && groups.get(0) == 1
                                                   && groups.get(1) == 1) {
                groups.remove(1);
                groups.remove(0);
                numTaxi++;
            }
            else if (len >= 2 && thisGroupSize == 1 && groups.get(0) == 1) {

                groups.remove(0);
                numTaxi++;
            }
            else if (thisGroupSize == 1) {

                numTaxi++;
            }
        }
        System.out.println(numTaxi);
    }
}
