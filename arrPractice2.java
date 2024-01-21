import java.util.*;

public class arrPractice2 {
    public static void printVal(int[] arr) {
        int n = arr.length;
        int i;
        System.out.println("Elements are :");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i]);

        }

    }

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        printVal(arr);
    }
}
