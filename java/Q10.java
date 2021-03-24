import java.util.Scanner;

public class Q10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long[] dp = new long[num+1];
        try {
            dp[1] = 1; dp[2] = 1;
            for (int i=3; i<dp.length; i++) {
                dp[i] = dp[i-2] + dp[i-1];
            }
            System.out.println(dp[num]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(dp[num]);
        }
    }
}
