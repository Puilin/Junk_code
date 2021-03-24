import java.util.Scanner;

public class Q14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ans = 1;
        for (int i=1; i<=3; i++) {
            int val = sc.nextInt();
            ans *= val;
        }
        String str = "" + ans;
        int[] arr = new int[10];
        for (int i=0; i<str.length(); i++) {
            int idx = new Integer("" + str.charAt(i)).intValue();
            arr[idx]++;
        }
        for (int j=0; j<arr.length; j++) System.out.println(arr[j]);
    }
}
