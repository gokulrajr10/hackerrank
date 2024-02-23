import java.util.*;

public class OnlineShopping {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt();
        int d1 = sc.nextInt();
        int s1 = sc.nextInt();
        int p2 = sc.nextInt();
        int d2 = sc.nextInt();
        int s2 = sc.nextInt();
        int p3 = sc.nextInt();
        int d3 = sc.nextInt();
        int s3 = sc.nextInt();
        int o1,o2,o3;
        o1=(int)(p1-(p1*d1*0.01)+s1);
        o2=(int)(p2-(p2*d2*0.01)+s2);
        o3=(int)(p3-(p3*d3*0.01)+s3);
        System.out.println("In Flipkart: Rs."+o1);
        System.out.println("In Snapdeal: Rs."+o2);
        System.out.println("In Amazon: Rs."+o3);
        if((o1<=o2) && (o1<=o3)){
            System.out.println("Choose Flipkart");
        }else if((o2<=o1) && (o2<=o3)){
            System.out.println("Choose Snapdeal");
        }else{
            System.out.println("Choose Amazon");
        }
        sc.close();
    }
}