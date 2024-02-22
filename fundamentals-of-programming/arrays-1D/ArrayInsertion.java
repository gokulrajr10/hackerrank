import java.util.*;

public class ArrayInsertion {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n+1];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int p = sc.nextInt();
        if(p>=n){
            System.out.println("Invalid Input");
        }else{
            int v = sc.nextInt();
            for(int i=n; i<=n; i--){
                if(i!=p-1){
                    a[i]=a[i-1];
                }else{
                    break;
                }
            }
            a[p-1]=v;
            System.out.println("Array after insertion is");
            for(int i=0;i<=n;i++){
                System.out.println(a[i]);
            }
        }
        sc.close();
    }
}