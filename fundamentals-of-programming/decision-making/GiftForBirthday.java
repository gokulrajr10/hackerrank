import java.util.*;

public class GiftForBirthday {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4 == 0){
            if(year%100 == 0){
                if(year%400 == 0){
                    System.out.println(year + " is a leap year");
                }else{
                    System.out.println(year + " is not a leap year");
                }
            }else{
                System.out.println(year + " is a leap year");
            }
        }else{
            System.out.println(year + " is not a leap year");
        }
        sc.close();
    }
}