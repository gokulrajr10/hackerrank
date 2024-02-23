import java.util.*;

public class SpecialNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(;m<=n;m++){
            // System.out.println(m);
            if(m>=10 && m<=99){
                int sum = (m/10)+(m%10);
                int pro = (m/10)*(m%10);
                if((sum+pro)==m){
                    System.out.println(m);
                }
            }
        }
        sc.close();
    }
}