import java.util.*;

public class TheNewspaperAgency {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int copy = sc.nextInt();
        int cc = sc.nextInt();
        int cch = sc.nextInt();
        System.out.println(copy*(cc-cch)-100);
        sc.close();
    }
}