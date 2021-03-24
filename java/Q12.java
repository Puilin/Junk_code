import java.uitl.*;
import java.util.Scanner;

public class Q12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int max = 0;
        for (int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) max = arr[i];
        }
        double[] arr2 = new double[num];
        for (int j=0; j<arr.length; j++) {
            arr2[j] = arr[j] / (double)max * 100.0;
        }
        double sum = 0.0;
        for (int k=0; k<arr2.length; k++) sum += arr2[k];
        System.out.println(sum / num);
    }
}
