import java.util.*;

public class Queue {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int b=0,rem=m;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]<=rem){
                rem -= a[i];
            }else{
                b++;
                rem = m - a[i];
            }
        }
        if(rem<m){
            b++;
        }
        System.out.println(b);
        sc.close();
    }
}