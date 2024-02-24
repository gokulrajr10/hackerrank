import java.util.*;

public class PrimeNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = prime(n,n/2);
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