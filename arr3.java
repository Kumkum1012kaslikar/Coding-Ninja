import java.util.Scanner;

public class arr3 {

    public static int[] Arrange(int n) {
        // write code
        int[] brr = new int[n];

        /*
         * int left = 0;
         * int right = n - 1;
         * int counter = 1;
         * while (left <= right) {
         * if (counter % 2 == 1) {
         * brr[left] = counter;
         * counter += 1;
         * left += 1;
         * } else {
         * brr[right] = counter;
         * counter += 1;
         * right -= 1;
         * }
         * 
         * }
         */

        // Second logic

        int p = (n - 1) / 2;
        int counter = 1;
        int counter2 = 2;
        for (int i = 0; i <= p; i++) {
            brr[i] = counter;
            counter += 2;
        }
        for (int i = n - 1; i > p; i--) {
            brr[i] = counter2;
            counter2 += 2;

        }

        return brr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[] arr = arr3.Arrange(i);

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

    }
}
