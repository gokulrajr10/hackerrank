import java.util.*;

public class SumOfPositiveOddNumbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Sum = "+sum(a,0,n));
        sc.close();
    }
    public static int sum(int a[],int i, int n){
        int sum = 0;
        if(i == n){
            return sum;
        }else{
            if(a[i]%2 == 0){
                return sum(a,i+1,n);
            }else{
                return (sum + a[i] + sum(a,i+1,n));
            }
        }
    }
}