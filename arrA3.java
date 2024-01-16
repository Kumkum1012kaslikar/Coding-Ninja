//Array intersection

import java.util.*;

public class arrA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("For A1 : ");
        int n = sc.nextInt();
        System.out.println("For A2 : ");
        int m = sc.nextInt();

        int[] arr1 = new int[n];

        int[] arr2 = new int[m];
        System.out.print("For i if index : ");
        for (int i = 0; i < n; i++) {

            arr1[i] = sc.nextInt();

        }
        System.out.print("For j if index : ");
        for (int j = 0; j < m; j++) {

            arr2[j] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.println("Answer is " + arr1[i]);
                    // arr2[j] = Integer.MIN_VALUE;
                    // break;
                }

            }

        }

    }
}