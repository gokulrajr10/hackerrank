import java.util.*;

public class FactorialOfNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The factorial of "+ n +" is "+factorial(n));
        sc.close();
    }
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
}