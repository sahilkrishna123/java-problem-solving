package String.Substring;

public class Substring1 {
    public static boolean containsSubstring(String str, String sub) {
        int n = str.length();
        int m = sub.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (str.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }
            if (j == m) return true;
        }
        return false;
    }

    static void main(String[] args) {
        // SLiding windows
        // check if a string contains another string (substring)
        String str = "hello world";
        String sub = "world";

        System.out.println(containsSubstring(str, sub));
    }
}
