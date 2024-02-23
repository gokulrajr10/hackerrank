import java.util.*;

public class SumOfZigZag {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int c1 = c-1;
        int a[][] = new int[r][c];
        int sum = 0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(i==0 || i==r-1){
                    sum += a[i][j];
                }
            }
            if(i!=0 && i!=r-1){
                    sum += a[i][c1-1];
            }
        }
        System.out.println("Sum of Zig-Zag pattern is "+sum);
        sc.close();
    }
}