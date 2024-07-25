import java.util.HashMap;
import java.util.Map;

class UserMainCode {

    public int samecharSubstrings(String input1) {
        // Step 1: Count frequency of each character
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : input1.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        // Step 2: Calculate the number of substrings for each character group
        int totalSubstrings = 0;
        for (int frequency : charFrequency.values()) {
            totalSubstrings += (frequency * (frequency + 1)) / 2;
        }

        return totalSubstrings;
    }

    public static void main(String[] args) {
        UserMainCode solution = new UserMainCode();
        System.out.println(solution.samecharSubstrings("asda")); // Output: 5
        System.out.println(solution.samecharSubstrings("xyxy")); // Output: 6
    }
}