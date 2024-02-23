import java.util.*;

class KaprekarNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int x = n;
        int sq = (int) Math.pow(n, 2);
        while (x > 0) {
            count++;
            x = x / 10;
        }
        int b = (int) (sq / (Math.pow(10, count)));
        int c = (int) (sq % (Math.pow(10, count)));
        sum = b + c;
        if (sum == n) {
            System.out.println("Kaprekar Number");
        } else {
            System.out.println("Not a Kaprekar Number");
        }
        sc.close();
    }
}