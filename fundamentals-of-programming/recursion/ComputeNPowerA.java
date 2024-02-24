import java.util.*;

public class ComputeNPowerA {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int res = power(n,a);
        System.out.println("The value of "+ n +" power "+ a +" is "+res);
        sc.close();
    }
    static int power(int n, int a){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            if(a==0){
                return 1;
            }else{
                return n * power(n,a-1);
            }
        }
    }
}