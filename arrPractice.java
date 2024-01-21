import java.util.*;

public class arrPractice {

    public static int[] Arrange(int n) {
        int[] brr = new int[n];
        int left = 0;
        int right = n - 1;
        int counter = 1;
        while (left <= right) {
            if (counter % 2 == 1) {
                brr[left] = counter;
                counter += 1;
                left += 1;
            } else {
                brr[right] = counter;
                counter += 1;
                right -= 1;
            }
        }
        return brr;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[] arr = arrPractice.Arrange(i);
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
