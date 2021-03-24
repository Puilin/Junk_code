import java.util.Scanner;

public class Q13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i=1; i<=5; i++) {
            int a = sc.nextInt();
            sum += Math.pow(a , 2);
        }
        System.out.println(sum % 10);
    }
}
