import java.util.*;

public class PrimeNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = prime(n,n/2);
        // n/2 - because we only have factor of the n only upto the n/2, eg. if n=10 factors=2,5 . So, n/2 is used to reduce the loop count
        if(c==0){
            System.out.println("Not a Prime Number");
        }else{
            System.out.println("Prime Number");
        }
        sc.close();
    }
    public static int prime(int n, int i){
        if(i==1){
            return 1;
        }else{
            if(n%i==0){
                return 0;
            }else{
                return prime(n,i-1);
            }
        }
    }
}