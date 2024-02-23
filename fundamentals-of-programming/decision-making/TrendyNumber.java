import java.util.*;

public class TrendyNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n/1000==0){
            if((((n/10)%10)%3)==0){
                System.out.println("Trendy Number");
            }else{
                System.out.println("Not a Trendy Number");
            }
        }else{
            System.out.println("Invalid Number");
        }
        sc.close();
    }
}