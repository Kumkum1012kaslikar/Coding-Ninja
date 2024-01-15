//for duplicate

import java.util.*;

public class arrA2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        outer: for (int k = 0; k < n; k++) {
            for (int j = 1; j < n; j++) {
                if (arr[k] == arr[j]) {
                    System.out.println(arr[k]);
                    break outer;
                }
            }

        }
    }

}
