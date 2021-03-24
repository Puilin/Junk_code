import java.util.*;

public class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] burgers = new int[3];
        for (int i=0; i<burgers.length; i++) {
            burgers[i] = sc.nextInt();
        }
        int[] b_coke = new int[3];
        int coke = sc.nextInt();
        for (int j=0; j<b_coke.length; j++) {
            b_coke[j] = burgers[j] + coke - 50;
        }
        int soda = sc.nextInt();
        int[] b_soda = new int[3];
        for (int k=0; k<b_soda.length; k++) {
            b_soda[k] = burgers[k] + soda - 50;
        }
        int min1 = b_coke[0];
        for (int l=1; l<b_coke.length; l++) {
            if (b_coke[l] < min1) min1 = b_coke[l];
        }
        int min2 = b_soda[0];
        for (int m=1; m<b_soda.length; m++) {
            if (b_soda[m] < min2) min2 = b_soda[m];
        }
        System.out.print(Math.min(min1, min2));
    }
}
