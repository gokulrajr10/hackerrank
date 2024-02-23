import java.util.*;

public class SplittingIntoTeams {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int t = sc.nextInt();
        System.out.println("The number of friends in each team is "+(f/t)+" and left out is "+(f%t));
        sc.close();
    }
}