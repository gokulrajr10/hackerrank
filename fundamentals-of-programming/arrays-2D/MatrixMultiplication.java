import java.util.*;

public class MatrixMultiplication {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a1[][] = new int[n][n];
        int a2[][] = new int[m][m];
        int s[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a1[i][j] = sc.nextInt();
                s[i][j] = 0;
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                a2[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                for(int k=0;k<n;k++){
                    s[i][j] += a1[i][k]*a2[k][j];
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(s[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}