import java.util.*;

public class StringSubsequence {

    public static int isSub(String s, String t) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        int si=0,ti=0;
        while (si < s.length() && ti < t.length()) {
            if (s.charAt(si) == t.charAt(ti)) {
                si++;
            }
            ti++;
        }

        return (si == s.length()) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        String s = sc.next();

        int result = isSub(s, t);
        System.out.println(result);
    }
}
