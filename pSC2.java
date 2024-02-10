
import java.util.*;

public class pSC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            char startingChar = (char) ('A' + i - 1);
            for (int j = 1; j <= n; j++) {

                System.out.print(startingChar);
                startingChar = (char) (startingChar + 1);
            }
            System.out.println();
        }
    }
}
