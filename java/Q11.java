import java.util.*;

public class Q11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] dp = new int[num+1][3];
        int[] cost = new int[num+1];
        for (int i=1; i<cost.length; i++) cost[i] = sc.nextInt();
        for (int i=1; i<dp.length; i++) {
            dp[i][0] = Math.max(Math.max(dp[i-1][0], dp[i-1][1]),dp[i-1][2]);
            dp[i][1] = dp[i-1][0] + cost[i];
            dp[i][2] = dp[i-1][1] + cost[i];
        }
        System.out.println(Math.max(Math.max(dp[num][0], dp[num][1]), dp[num][2]));
    }
}