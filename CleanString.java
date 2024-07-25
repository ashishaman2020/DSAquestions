import java.util.HashSet;
import java.util.Set;

public class CleanString {
    public static String cleanString(String A, String B) {
        Set<Character> setA = new HashSet<>();
        Set<Character> setB = new HashSet<>();
        for (char c : A.toCharArray()) {
            setA.add(c);
        }
        for (char c : B.toCharArray()) {
            setB.add(c);
        }
        StringBuilder result = new StringBuilder();
        for (char c : A.toCharArray()) {
            if (!setB.contains(c)) {
                result.append(c);
            }
        }
        return result.length() == 0 ? "Empty" : result.toString();
    }

    public static void main(String[] args) {
        String A = "AABBCC";
        String B = "AB";
        System.out.println(cleanString(A, B));  // Output: "CC"

        A = "AABBCC";
        B = "ABCDDSD";
        System.out.println(cleanString(A, B));  // Output: "Empty"
    }
}