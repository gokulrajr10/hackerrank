import java.util.*;

public class AmoebaMultiplication {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, f = 0, s = 1;
        if(n==1){
            System.out.println(0);
        }else if(n==2){
            System.out.println(1);
        }else{
            for(int i=3;i<=n;i++){
            sum = f + s;
            f = s;
            s = sum;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}