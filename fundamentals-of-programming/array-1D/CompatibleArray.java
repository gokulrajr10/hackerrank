import java.util.*;

public class CompatibleArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int c=0;
        int a1[] = new int[n1];
        for(int i=0;i<n1;i++){
            a1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int a2[] = new int[n2];
        for(int i=0;i<n2;i++){
            a2[i] = sc.nextInt();
        }
        if(n1==n2){
            for(int i=0;i<n1;i++){
                if(a1[i]>=a2[i]){
                    c=1;
                }else{
                    c=0;
                    break;
                }
            }
        }
        if(c==1){
            System.out.println("Compatible");
        }else{
            System.out.println("Incompatible");
        }
        sc.close();
    }
}