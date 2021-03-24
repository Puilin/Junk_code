import java.util.Arrays;
import java.util.Scanner;

public class Q7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i=0; i<num; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++) System.out.println(arr[i]);
        // int buffer = 0;
        // for (int j=0; j<num-1; j++) {
        //     for (int i=1; i<arr.length; i++) {
        //         if (arr[i] < arr[i-1]) {
        //             buffer = arr[i-1];
        //             arr[i-1] = arr[i];
        //             arr[i] = buffer;
        //         }
        //     }
        // }
        // for (int i=0; i<arr.length; i++) System.out.println(arr[i]);
    }
}
