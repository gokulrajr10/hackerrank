import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int l = str.length();
        String rev = "";
        for(int i=l-1;i>=0;i--){
            rev += str.charAt(i);
        }
        int p=0;
        for(int i=0;i<l;i++){
            if(str.equals(rev)){
                p=0;
            }else{
                p=1;
                break;
            }
        }
        if(p==0){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}