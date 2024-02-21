public class R4 {
    public static void removeDuplicates(String s) {
        if (s.length() <= 1) {
            System.out.println(s);

        }
        if (s.charAt(0) == s.charAt(1)) {

            System.out.println(s.substring(1));
        } else {
            String small = (s.substring(1));
            System.out.println((0) + small);
        }

    }

    public static void main(String[] args) {
        String arr = "a,a,b,a,c,d,d";
        removeDuplicates(arr);

    }
}
