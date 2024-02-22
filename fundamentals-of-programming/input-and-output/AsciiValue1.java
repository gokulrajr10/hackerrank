import java.util.*;

public class AsciiValue1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int a = (int)c;
        System.out.println(a);
        sc.close();
    }
}