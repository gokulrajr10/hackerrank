import java.util.*;

public class MultiplicationTable {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter m");
        int m = sc.nextInt();
        System.out.println("The multiplication table of " + n + " is");
        for(int i=1;i<=m;i++){
            System.out.println(i + "*" + n + "=" + i*n);
        }
        sc.close();
    }
}