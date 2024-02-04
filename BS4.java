public class BS4 {

    public static int[] merge(int[] arr, int[] brr) {
        int[] crr = new int[arr.length + brr.length];
        int k = 0;
        int i = 0;
        int j = 0;
        while (i < arr.length && j < brr.length) {
            if (arr[i] < brr[j]) {
                crr[k] = arr[i];
                k++;
                i++;

            }

            else {

                crr[k] = brr[j];
                j++;
                k++;

            }
        }
        while (i < arr.length) {
            crr[k] = arr[i];
            k++;
            i++;
        }
        while (j < brr.length) {
            crr[k] = brr[j];
            j++;
            k++;
        }
        return crr;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 9, 10, 12 };
        int[] brr = { 2, 6, 15, 20, 40 };
        int crr[] = merge(arr, brr);
        for (int i = 0; i < crr.length; i++) {
            System.out.print(crr[i] + " ");
        }
        System.out.println();
    }
}