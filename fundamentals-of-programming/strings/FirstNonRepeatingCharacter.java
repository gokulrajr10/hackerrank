import java.util.*;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count[] = new int[256];
        int flag = 0;
        char ch = ' ';
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 1) {
                flag = 1;
                ch = s.charAt(i);
                break;
            }
        }
        if (flag == 1)
            System.out.println(ch);
        else
            System.out.println("All the characters are repetitive");
        sc.close();
    }
}