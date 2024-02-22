import java.util.*;

public class UpperTriangularMatrix {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int c = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(a[i][j]!=0){
                    c = 1;
                    break;
                }else{
                    c = 0;
                }
            }
        }
        if(c==0){
            System.out.println("Upper triangular matrix");
        }else{
            System.out.println("Not an Upper triangular matrix");
        }
        sc.close();
    }
}