import java.util.*;

public class CountTheVowels {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int c=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                c++;
            }
        }
        System.out.println("Number of vowels: "+c);
        sc.close();
    }
}