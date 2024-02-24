import java.util.*;

public class MaximumElementInAnArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Maximum element in the array is "+max(a,n,0,0));
        sc.close();
    }
    static int max(int a[], int n,int m, int i){
        if(i==n){
            return m;
        }else{
            if(a[i]>m){
                m = a[i];
                return max(a,n,m,i+1);
            }else{
                return max(a,n,m,i+1);
            }
        }
    }
}