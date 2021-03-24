import java.util.Scanner;

public class Q8 {
    public static int zero_count = 0;
    public static int one_count = 0;

    public static int fibonacci(int n) {
        if (n == 0) {
            zero_count++;
            return 0;
        }
        else if (n == 1) {
            one_count++;
            return 1;
        }
        else { return fibonacci(n-1) + fibonacci(n-2); }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=0; i<num; i++) {
            int a = fibonacci(sc.nextInt());
            System.out.print(zero_count + " " + one_count + "\n");
            zero_count = 0;
            one_count = 0;
        }
    }
}
