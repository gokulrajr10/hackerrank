import java.util.*;

public class TicTacToe {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n){
            case 1:
                System.out.println("0 0");
                break;
            case 2:
                System.out.println("0 1");
                break;
            case 3:
                System.out.println("0 2");
                break;
            case 4:
                System.out.println("1 0");
                break;
            case 5:
                System.out.println("1 1");
                break;
            case 6:
                System.out.println("1 2");
                break;
            case 7:
                System.out.println("2 0");
                break;
            case 8:
                System.out.println("2 1");
                break;
            case 9:
                System.out.println("2 2");
                break;
        }
        sc.close();
    }
}