public class R1 {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int smallAns = fact(n - 1);
        return smallAns * n;
    }

    public static void main(String[] args) {
        int ans = fact(3);
        System.out.println(ans);
    }
}
