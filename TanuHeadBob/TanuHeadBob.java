import java.util.Scanner;

public class TanuHeadBob {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0; i<T; i++){
            int N = in.nextInt();
            String str = in.next();
            for (int j=0; j<N; j++){
                char letter = str.charAt(j);
                if (letter == 'Y'){
                    System.out.println("NOT INDIAN");
                    break;
                }
                else if (letter == 'I'){
                    System.out.println("INDIAN");
                    break;
                }
                if (j == N-1){
                    System.out.println("NOT SURE");
                }
            }
        }
    }
} //CHANGE CLASS TO MAIN!!!!!
