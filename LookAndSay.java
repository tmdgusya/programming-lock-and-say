import java.util.Arrays;
import java.util.List;

public class LookAndSay {
    private static String ant(int n) {
        String s = "1";
        for (int line = 0; line < n; line++) {
            s = next(s);
        }
        // var result = next2(List.of(1,2,2,1,1,1));
        // s = result.toString();
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

    private static List<Integer> next2(List<Integer> ns) {
        return ListUtils.concat(ListUtils.map(g -> List.of(g.size(), g.get(0)), ListUtils.group(ns)));
    }

    public static void main(String... args) {
        var result = ant(1); 
        System.out.println(result);
    }
}