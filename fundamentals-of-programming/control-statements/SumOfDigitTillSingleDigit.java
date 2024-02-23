import java.util.*;

public class SumOfDigitTillSingleDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a > 9) {
            int temp = a;
            int b = 0; 
            while (temp > 0) {
                b += temp % 10;
                temp /= 10;
            }
            a = b;
        }
        System.out.println(a);
        sc.close();
    }
}