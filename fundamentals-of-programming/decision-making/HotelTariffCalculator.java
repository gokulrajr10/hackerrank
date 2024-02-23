import java.util.*;

public class HotelTariffCalculator {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int r = sc.nextInt();
        int d = sc.nextInt();
        int res;
        if(m==4 || m==5 || m==6 || m==11 || m==12){
            res = (r+(r*20/100))*d;
            System.out.println(res);
        }else if(m==1 || m==2 || m==3 || m==7 || m==8 || m==9 || m==10){
            res = r*d;
            System.out.println(res);
        }else{
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}