import java.util.*;

public class MoveAllZeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        String[] b = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int len = 0;
            String l = String.valueOf(a[i]);
            len = l.length();
            b[i] = "";
            for (int x = 1; x <= len; x++) {
                if (a[i] % 10 == 0)
                    b[i] = "" + b[i] + a[i] % 10;
                else
                    b[i] = "" + a[i] % 10 + b[i];
                a[i] /= 10;
            }
        }
        for (String i : b) {
            System.out.println(i);
        }
        sc.close();
    }
}