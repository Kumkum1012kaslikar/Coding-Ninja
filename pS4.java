import java.util.*;

public class pS4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("for while loop :");

        int i = 1;
        while (i <= n) {
            int j = n;
            while (j >= 1) {
                System.out.print(j);
                j--;
            }
            System.out.println();
            i++;
        }
    }

}
