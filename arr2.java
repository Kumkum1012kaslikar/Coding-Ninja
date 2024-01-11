public class arr2 {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static int[] incrementArray(int arr[]) {
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            arr[i]++;
        }
        return arr;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        incrementArray(arr);
        print(arr);

    }
}
