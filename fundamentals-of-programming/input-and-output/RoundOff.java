import java.util.*;

public class RoundOff {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        System.out.println((int)n);
        System.out.println((int)Math.ceil(n));
        System.out.println((int)Math.floor(n));
        sc.close();
    }
}