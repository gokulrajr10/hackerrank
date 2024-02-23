import java.util.*;

public class UniformityMatrix {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int b=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(a[0][0]%2==0){
                    if(a[i][j]%2==0){
                        b=0;
                    }else{
                        b=1;
                        break;
                    }
                }else{
                    if(a[i][j]%2!=0){
                        b=0;
                    }else{
                        b=1;
                        break;
                    }
                }
            }
        }
        if(b==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}