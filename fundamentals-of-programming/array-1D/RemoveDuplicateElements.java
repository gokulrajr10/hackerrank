import java.util.*;

public class RemoveDuplicateElements {

    public static void main(String[] args) {
        //remove duiplicate elements:
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int d[] = new int[n];
        int s = 0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int uniqueCount = 0;
        //d[0]=a1[0];
        for (int i = 0; i < a.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == d[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                d[uniqueCount] = a[i];
                uniqueCount++;
            }
        }
            
        for(int i=0;i<uniqueCount;i++){
            System.out.println(d[i]);
        }
        sc.close();
    }
}