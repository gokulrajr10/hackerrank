import java.util.*;

public class InvertedRightAngledTriangle {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=n;
        for(int i=0;i<n;i++){
            for(int j=k;j!=0;j--){
                System.out.print("*");
            }
            k--;
            System.out.println("");
        }
        sc.close();
    }
}