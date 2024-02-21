public class R3 {
    public static String replaceCharacter(String arr, char c1, char c2) {
        if (arr.length() == 0) {
            return "";
        }
        char c;
        if (arr.charAt(0) == c1) {
            c = c2;
        } else {
            c = arr.charAt(0);
        }
        String ans = replaceCharacter(arr.substring(1), c1, c2);
        return (c + ans);
    }

    public static void main(String[] args) {
        String arr = "a,b,c,d";
        System.out.println(replaceCharacter(arr, 'a', 'c'));
    }
}
