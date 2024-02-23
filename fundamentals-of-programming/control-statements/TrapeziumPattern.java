import java.util.Scanner;

public class TrapeziumPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tn = n;
        int m=0;
        int tot=0;
        int begin = 1;
        String s ="--";
        for(int i = 1; i<=n; i++){
            tot += i*2;
        }
        for(int i = 1; i<=n; i++){
            String right="";
            String left = "";
            for(int j = 1; j<=tn; j++){
                left = left+begin+"*";
                begin++;
                if(j!=tn)
                    right = "*"+tot+right;
                else
                    right = tot+right;
                tot--;
            }
            String out = left+right;
            for (int k = 1; k<=m; k++){
                out = s+out;
            }
            m++;
            tn--;
            System.out.println(out);
        }
        sc.close();
    }
}