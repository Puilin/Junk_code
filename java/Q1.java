import java.util.*;

public class Q1 {
    public static String min(int[] arr) {
        int minimum = arr[0];
        int idx = 0;
        for (int i=1; i<arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
                idx = i;
            }
        }
        return minimum + " " + idx;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][3];
        for (int i=0; i<num; i++) {
            for (int j=0; j<3; j++) {
                int pay = new Integer(sc.next()).intValue();
                arr[i][j] = pay;
            }
        }
        int[] list = new int[3];
        for (int count=1; count<=3; count++) {
            int idx = 0;
            int sum = 0;
            sum += arr[0][count-1];
            idx = count-1;
            for (int i=1; i<arr.length; i++) {
                int[] temp = new int[3];
                for (int j=0; j<3; j++) {
                    if (j != idx) {
                        temp[j]= arr[i][j];
                    } else {
                        temp[j] = 1001;
                    }
                }
                String ans = min(temp);
                StringTokenizer t = new StringTokenizer(ans, " ");
                int value = new Integer(t.nextToken()).intValue();
                sum += value;
                idx = new Integer(t.nextToken()).intValue();
            }
            list[count-1] = sum;
        }
        String real_ans = min(list);
        int res = new Integer(new StringTokenizer(real_ans, " ").nextToken()).intValue();
        System.out.print(res);
    }
}