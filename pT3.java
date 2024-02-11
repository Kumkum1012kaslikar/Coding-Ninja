
import java.util.*;

public class pT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("for while loop:");
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}