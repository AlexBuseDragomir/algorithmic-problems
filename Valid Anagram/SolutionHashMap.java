import java.util.HashMap;
import java.util.Map;

class SolutionHashMap {

    public boolean isAnagram(String s, String t) {
        final Map<Character, Integer> lettersMap = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (char ch : s.toCharArray()) {
            lettersMap.computeIfPresent(ch, (key, value) -> value + 1);
            lettersMap.putIfAbsent(ch, 1);
        }

        for (char ch : t.toCharArray()) {
            if (lettersMap.get(ch) == null || lettersMap.get(ch) == 0) {
                return false;
            }
            lettersMap.computeIfPresent(ch, (key, value) -> value - 1);
        }

        return true;
    }
}