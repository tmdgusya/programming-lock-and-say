public class LookAndSay {
    private static String ant(int n) {
        String s = "1";
        for (int line = 0; line < n; line++) {
            s = next(s);
        }
        return s;
    }

    private static String next(String s) {
        int length = 1;
        char head = s.charAt(0);
        String result = "";

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == head) {
                length++;
            } else {
                result += length;
                result += head;
                length = 1; // reset
                head = s.charAt(i);
            }
        }
        result += length;
        result += head;
        return result;
    }

    public static void main(String... args) {
        var result = ant(10); 
        System.out.println(result);
    }
}