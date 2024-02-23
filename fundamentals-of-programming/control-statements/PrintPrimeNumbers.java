import java.util.*;

public class PrintPrimeNumbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<=n;i++){
            boolean prime = true;
            for(int j=2;j<i;j++){
                if(i%j == 0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}