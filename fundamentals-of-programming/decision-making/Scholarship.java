import java.util.*;

public class Scholarship {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int year = sc.nextInt();
        int income = sc.nextInt();
        int arrear = sc.nextInt();
        int exam = sc.nextInt();
        int atten = sc.nextInt();
        if(year>=2021 && arrear<=2 && income<=200000 && age>=18 && age<21 && exam>=60 && atten>=80){
            System.out.println("Eligible");
        }else if(arrear>2 && exam>80 && atten>=90 && income>=200000 && income<250000 && year>=2021 && age>=18 && age<21){
            System.out.println("Partially Eligible");
        }else{
            System.out.println("Not Eligible");
        }
        sc.close();
    }
}