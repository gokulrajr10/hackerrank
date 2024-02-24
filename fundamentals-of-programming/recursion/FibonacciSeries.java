import java.util.*;

public class FibonacciSeries {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The term "+n+" in the Fibonacci series is "+fib(n));
        sc.close();
    }
    public static int fib(int n){
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
}