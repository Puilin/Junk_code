import java.util.*;

public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i=0; i<arr.length; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int[] dp = new int[num];
        for (int j=0; j<dp.length; j++) {
            if (j==0)
                dp[j] = arr[j];
            else {
                dp[j] = dp[j-1] + arr[j];
            }
        }
        int sum = 0;
        for (int k=0; k<dp.length; k++) sum += dp[k];
        System.out.print(sum);
    }
}
