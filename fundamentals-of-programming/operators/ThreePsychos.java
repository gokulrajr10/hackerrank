import java.util.*;

public class ThreePsychos {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.printf("Arun's house is located at(%.1f,%.1f)",(float)(x1+x2)/2,(float)(y1+y2)/2);
        sc.close();
    }
}