import java.util.*;

public class HollowSquarePattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = " ";
        for (int i =1; i<= n; i++){
            if(i==1 || i==n){
                 for (int j =1; j<= n; j++){
                    System.out.print("*");
                 }
                System.out.print("\n");
            }else{
                 for (int j =1; j<= n; j++){
                     if(j==1 || j==n){
                         System.out.print("*" );
                     }else{
                         System.out.print(s);
                     }
                    
                 }
                System.out.print("\n");
                
            }
        }
        sc.close();
    }
}