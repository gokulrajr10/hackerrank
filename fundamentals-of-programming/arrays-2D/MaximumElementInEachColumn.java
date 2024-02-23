import java.util.*;

public class MaximumElementInEachColumn {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int s = 0;
        int a[][] = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int j=0; j<c; j++){
            for(int i=0; i<r; i++){
                if(i!=r-1){
                    if(a[i][j]>a[i+1][j]){
                        s = a[i][j];
                    }else{
                        s = a[i+1][j];
                    }
                }else{
                    break;
                }
            }
            System.out.println(s);
        }
        sc.close();
    }
}