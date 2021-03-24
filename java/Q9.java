import java.util.Scanner;

public class Q9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] cost = new int[num+1];
        for (int i=1; i<cost.length; i++) cost[i] = sc.nextInt();
        int[] dp = new int[num+1];
        try {
            dp[1] = cost[1]; dp[2] = cost[1] + cost[2];
            dp[3] = Math.max(cost[1] + cost[3], cost[2] + cost[3]);
            int i = 0;
            for (i=4; i<dp.length; i++) {
                dp[i] = Math.max(dp[i-3] + cost[i-1] + cost[i], dp[i-2] + cost[i]);
            }
            System.out.println(dp[i-1]);        
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(dp[num]);
        }
    }
}
