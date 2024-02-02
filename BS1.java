import java.util.*;

public class BS1 {
    public static int binarySearch(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start;
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] > x) {
                end = mid - 1;

            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                // return mid;
                System.out.println(mid);
                break;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.println("");
        }
        System.out.println("Answer is : ");
        binarySearch(arr, 8);

    }
}
