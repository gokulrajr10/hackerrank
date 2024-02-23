import java.util.*;

public class NumberOfDays {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // y = year, m = month, l = leap
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int l = 0;
        if(y>=1900 && y<=9999 && m>=1 && m<=12){
            if(y%4 == 0){
                if(y%100 == 0){
                    if(y%400 == 0){
                        l = 1;
                    }else{
                        l = 0;
                    }
                }else{
                    l = 1;
                }
            }else{
                l = 0;
            }
            if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
                System.out.println("31 Days");
            }else{
                if(l==1 && m==2){
                    System.out.println("29 Days");
                }else if(l==0 && m==2){
                    System.out.println("28 Days");
                }else{
                    System.out.println("30 Days");
                }
            }
        }
        sc.close();
    }
}