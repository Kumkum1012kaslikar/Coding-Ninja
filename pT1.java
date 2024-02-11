
import java.util.*;

public class pT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {

                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("for while loop:");
        int i = 1;
        while (i <= n) {
            int j = i;
            while (j >= 1) {
                System.out.print("*");
                j--;
            }
            System.out.println();
            i++;
        }
    }
}