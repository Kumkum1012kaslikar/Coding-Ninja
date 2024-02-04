public class BS3 {
    public static int[] insertionSort(int[] arr) {
        int i = 1;
        int temp;

        while (i < arr.length) {
            temp = arr[i];
            int j = i - 1;

            while (j >= 0) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
                j -= 1;
            }
            arr[j + 1] = temp;
            i += 1;

        }

        /*
         * for(int i=1;i<arr.length;i++){
         * int j=i-1;
         * int temp=arr[i];
         * while(j>=0 && arr[j]>temp){
         * arr[j+1]=arr[j];
         * j--;}
         * arr[j+1]=temp;
         * }
         */
        return arr;

    }

    public static void print(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 9, 4, 8, 3, 1 };
        insertionSort(arr);
        print(arr);
    }

}
