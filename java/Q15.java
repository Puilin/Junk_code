import java.util.Scanner;

public class Q15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] cost = new int[num+1];
        for (int i=1; i<cost.length; i++) cost[i] = sc.nextInt();
        int[][] dp = new int[num+1][2];
        int max = cost[1]; dp[1][0] = cost[1]; dp[1][1] = cost[1];
        int idx = 0;
    }
}
