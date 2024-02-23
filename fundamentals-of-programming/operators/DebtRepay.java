import java.util.*;

public class DebtRepay {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        float p = sc.nextFloat();
        float r = sc.nextFloat();
        float n = sc.nextFloat();
        float i = (p*n*r)/100;
        System.out.printf("%.2f\n",i);
        System.out.printf("%.2f\n",p+i);
        System.out.printf("%.2f\n",i*2/100);
        System.out.printf("%.2f\n",(p+i)-(i*2/100));
        sc.close();
    }
}