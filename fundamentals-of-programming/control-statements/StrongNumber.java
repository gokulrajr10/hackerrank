import java.util.*;

public class StrongNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = String.valueOf(n).length();
        int res=n,sum=0,temp=0,f=0;
        for(int i=0; i<l;i++){
            f = n%10;
            n = n/10;
            temp = factorial(f);
            sum += temp;
        }
        if(sum==res){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
    static int factorial(int a){
        int sum = 1;
        while(a!=0){
            sum = sum * a;
            a--;
        }
        return sum;
    }
}