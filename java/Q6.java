import java.util.Scanner;

public class Q6 {
    public static int foo(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) return 1;
        else { return 0; }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(foo(sc.nextInt()));
    }
}
