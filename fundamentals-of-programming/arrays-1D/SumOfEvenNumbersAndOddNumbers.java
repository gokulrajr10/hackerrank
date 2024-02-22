import java.util.*;

public class SumOfEvenNumbersAndOddNumbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int se=0,so=0;
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        if(n<=15){
            for(int i=0;i<n;i++){
                if(a[i]%2 == 0){
                    se += a[i];
                }else{
                    so += a[i];
                }
            }
        }
        System.out.println("The sum of the even numbers in the array is "+se);
        System.out.println("The sum of the odd numbers in the array is "+so);
        sc.close();
    }
}