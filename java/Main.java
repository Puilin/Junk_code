import java.util.*;

public class Main {
    public static void main(String[] args) {
        // a 97 A 65
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        word = word.toLowerCase();
        int arr[] = new int[33];
        for (int i=0; i<word.length(); i++) {
            int idx = (int)word.charAt(i) - 97;
            arr[idx]++;
        }
        int max = 0; int idx = 0; boolean check = false;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idx = i;
                check = false;
            } else if (arr[i] == max) {
                check = true;
            }
        }
        if (check) System.out.println("?");
        else { System.out.println((char)(idx + 65)); }
    }
}