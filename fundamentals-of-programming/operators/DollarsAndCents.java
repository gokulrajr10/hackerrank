import java.util.*;

public class DollarsAndCents {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int sum = a + c;
        int e = b + d;
        int f, g;
        f = (int)e/100;
        g = (int)e%100;
        sum = sum + f;
        System.out.println(sum);
        System.out.println(g);
        sc.close();
    }
}