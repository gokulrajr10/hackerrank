import java.util.*;

public class HopHop {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int x1 = 3, y1 = 4;
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println((int)Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
        sc.close();
    }
}