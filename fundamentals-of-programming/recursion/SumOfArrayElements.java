import java.util.*;

public class SumOfArrayElements {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(sum(a,n));
        sc.close();
    }
    public static int sum(int a[],int n){
        if(n<=0){
            return 0;
        }else{
            return (a[n-1] + sum(a,n-1));
        }
    }
}