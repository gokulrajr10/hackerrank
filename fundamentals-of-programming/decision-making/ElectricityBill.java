import java.util.*;

public class ElectricityBill {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double res;
        if(n>=1 && n<=200){
            res = (n*0.5);
        }else if(n>=201 && n<=400){
            res = (n*0.65) + 100;
        }else if(n>=401 & n<=600){
            res = (n*0.80) + 200;
        }else{
            res = (n*1.25) + 425;
        }
        System.out.println("Rs."+(int)res);
        sc.close();
    }
}