import java.util.*;

public class CountDistinctElements {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int d=0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=1;i<n;i++){
            if(a[i]!=a[i-1]){
                d++;
            }
        }
        d+=1;
        // System.out.println(d);
        System.out.println("There are "+d+" distinct element in the array.");
        sc.close();
    }
}