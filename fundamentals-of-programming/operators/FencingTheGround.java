import java.util.*;

public class FencingTheGround {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The required length is "+2*(l+b)+" m");
        System.out.println("The required area of carpet is "+l*b+" sqm");
        sc.close();
    }
}