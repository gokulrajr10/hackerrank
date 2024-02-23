import java.util.*;

public class NumberSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    // f -first, s - second
        int n = sc.nextInt();
        int s = 2;
        int f = 0;
        if(n == 1){
            System.out.println("0");
        }else if(n == 2){
            System.out.println("0 2");
        }else {
            for(int i=1; i<=n; i++){
                if(i==1){
                    System.out.print("0");
                    continue;
                }else if(i==2){
                    System.out.print(" 2");
                    f =2;
                    continue;
                }else{
                    if((i-1)%2==0){
                        s +=4;
                    }
                    System.out.print(" "+(f+s));
                    f = f+s;
                }
            }
        }
        sc.close();
    }
}