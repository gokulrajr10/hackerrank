import java.util.*;

public class HarryPotter {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = Math.abs(n);
        System.out.println((n%10)+(n/1000));
        sc.close();
    }
}