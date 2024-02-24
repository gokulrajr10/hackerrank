import java.util.*;

public class NumberOfDigits {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The number of digits in "+n+" is "+count(n));
        sc.close();
    }
    public static int count(int n){
        if(n < 10){
            return 1;
        }else{
            return 1 + count(n/10);
        }
    }
}