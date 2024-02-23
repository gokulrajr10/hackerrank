import java.util.*;

public class CheckingAlphabets {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(Character.isAlphabetic(c)){
            c = Character.toLowerCase(c);
            if('a'==c||'e'==c||'i'==c||'o'==c||'u'==c){
                System.out.println("Vowel");
            }else{
                System.out.println("Consonant");
            }
        }else{
            System.out.println("Not an alphabet");
        }
        sc.close();
    }
}