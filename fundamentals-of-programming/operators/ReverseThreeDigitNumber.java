import java.util.*;

public class ReverseThreeDigitNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res;
        while(n!=0){
            res = n%10;
            System.out.print(res);
            n=n/10;
        }
        sc.close();
    }
}