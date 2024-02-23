import java.util.*;

public class TreasureHunter {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y1, y2, y3;
        y1 = (x1*x2)/100;
        x1 -= y1;
        y2 = (x1*x3)/100;
        x1 -= y2;
        y3 = (x1/3);
        System.out.println(y1+"\n"+y2+"\n"+y3);
        sc.close();
    }
}